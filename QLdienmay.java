/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktgk;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class QLdienmay {
    public static int MAX= 50;
    private  dienmay[] dm;
    private int n; 
    /* Constructor */
    //QLdienmay list= new QLdienmay();
    
    public QLdienmay(){
        dm= new dienmay[MAX];
        n= 0;
    }
    public dienmay[] getdienmay() {
        return dm;
    }
    public void setdienmay(dienmay[] arr){
        this.dm=arr;
    }
    
           
    private int search(String id){
        
        int result= -1;
        for(int i = 0; i<this.n; ++i){
            if (dm[i].getmahang().equals(id)){
                result=  i;
                break;
            }
        } 
        return  result;
    }
    //xóa một mặt hàng
    public void deletehang(String mahang){
        int i= search(mahang);
        boolean cond= (i != -1);
        if (!cond) {
            System.out.println("Error: No such employee!");
            return;
        }
        /*Có tồn tại hàng */
        for (int j= i; j<=n -2 ; j++){
        dm[i]=  dm[i+1];
    }
        n--; //giảm số nhân viên đi 1
}
    //thay đổi thông tin hàng
    public void changehang(String mahang,String tenhang,String nhomhang,long giaban,int soluong){
        int i= search(mahang);
        boolean cond= (i!= -1);
        if (!cond) {
            System.out.println("Error: No such employee!");
            return;
        }
    //Có tồn tại nhân viên
    dm[i].setmahang(mahang);
    dm[i].settenhang(tenhang);
    dm[i].setnhomhang(nhomhang);
    dm[i].setgiaban(giaban);
    dm[i].setsoluong(soluong);
}
    /* Thêm một nhân viên */
    public void addEmployee(String mahang, String tenhang,String nhomhang, long giaban, int soluong){
        boolean cond= (search(mahang)==-1); 
        if (!cond){ //id đã tồn tại trong mảng
            System.out.println("Error: The id already exists!");
	return;
        }
        dienmay[] e= new  dienmay[this.n + 1];
        for (int i= 0; i<this.n; i++){
            e[i]=dm[i];
        }
        e[this.n]= new dienmay(mahang, tenhang, nhomhang,giaban,soluong); //thêm vào mảng
        dm= new  dienmay[this.n + 1];
        for (int j= 0; j<e.length; j++){
             dm[j]=e[j];
        }
        this.n +=1;
        //System.exit(0);
    }
    public void input(){
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so hang can them: ");
        this.n = Integer.parseInt(sc.nextLine());
       // dm = new dienmay[this.n];
       this.dm= new dienmay[n];
        
        for (int i= 0; i<this.n; i++){
            dm[i]= new dienmay();
           
            dm[i].input("Nhập hàng thứ "+i);
           
           
       }
        
    }
    @Override
    public String toString(){
    String list = String.format("%5s %5s %5s %5s %5s", "mahang","tênhang","nhomhang","giaban","soluong")+"\n"; 
    for (int i= 0; i<this.n; ++i){
	list= list +dm[i].toString();
    }
    return list;
    }

    
}
    

