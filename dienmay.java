/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktgk;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class dienmay implements Serializable{
    
    String mahang,tenhang;
    String nhomhang;
    long giaban;
    int soluong;
    public dienmay(){
        this.mahang="";
        this.tenhang="";
        this.nhomhang="";
        this.giaban=0;
        this.soluong=0;
    }
     public dienmay(String mahang,String tenhang,String nhomhang,long giaban,int soluong){
        this.mahang= mahang;
        this.tenhang= tenhang;
        this.nhomhang=nhomhang;
        this.giaban=giaban;
        this.soluong=soluong;
        
    }
    // public dienmay(dienmay pt){
    // this.mahang= pt.mahang;
   //     this.tenhang= pt.tenhang;
   //     this.nhomhang=pt.nhomhang;
   //     this.giaban=pt.giaban;
   //     this.soluong=pt.soluong;
    // }
    //public person(person ps){
    //    this.id=ps.id;
    //    this.name=ps.name;
     //this.yearOfBirth=ps.yearOfBirth;
    //} 
    public String getmahang(){
        return mahang;
    }
    public String gettenhang(){
        return tenhang;
    }
    public String getnhomhang(){
        return nhomhang;
    }
    public long getgiaban(){
        return giaban;
    }
    public int getsoluong(){
        return soluong;
    }
    public void setmahang(String mahang){
        this.mahang=mahang;
    }
    public void settenhang(String tenhang){
        this.tenhang=tenhang;
    }
    public void setnhomhang(String nhomhang){
        this.nhomhang=nhomhang;
    }
    public void setgiaban(long giaban){
        this.giaban=giaban;
    }
    public void setsoluong(int soluong){
        this.soluong=soluong;
    }    
    public void input(String tieude){
        Scanner sc =new Scanner(System.in);
        System.out.println(tieude);
        System.out.print("Nhập mahang: ");
        this.mahang=sc.nextLine();
        System.out.print("Nhập tênhang: ");
        this.tenhang=sc.nextLine();
        System.out.print("Nhập nhomhang: ");
        this.nhomhang=sc.nextLine();
        System.out.print("Nhập giaban: ");
        this.giaban=Long.parseLong(sc.nextLine());
        System.out.print("Nhập soluong: ");
        this.soluong=Integer.parseInt(sc.nextLine());
    }
    
    @Override
    public String toString(){
        String str = String.format("%5s %5s %5s %5s %5d", mahang,tenhang,nhomhang,giaban,soluong)+"\n";
        return str;        
    }
     
    
}


