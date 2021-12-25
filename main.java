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
public class main {
    public static void main(String[] args)  {
        
        int bc;
          Scanner sc=new Scanner(System.in);
          QLdienmay list= new QLdienmay();         
        do{
        System.out.println("\n1-Nhập thông tin các mặt hàng");
        System.out.println("2-Xuất danh sách toàn bộ mặt hàng");
        System.out.println("3-Thêm nhân viên");
        System.out.println("4-Thay đổi thông tin hàng");
        System.out.println("5-Xóa hàng");
        System.out.println("6-Ghi mảng mặt hàng xuống file");
        System.out.println("7-Đọc danh sách mặt hàng từ file");
        System.out.println("0-Thoát chương trình");
        System.out.print("Bạn chọn: ");
        bc=Integer.parseInt(sc.nextLine());
        switch(bc)
        {
            case 1:{                                                     
                list.input();
                //System.out.println(list.toString());
                break;
            }
                   
                    
            case 2: {
                System.out.println(list.toString());
                break;
            }
            case 3: {
                //Thêm 1 nhân viên
                System.out.println("----Thêm một nhân viên----");
                System.out.print("Nhập mahang: ");
                String mahang=sc.nextLine();
                System.out.print("Nhập tênhang: ");
                String tenhang=sc.nextLine();
                System.out.print("Nhập nhomhang: ");
                String nhomhang=sc.nextLine();
                System.out.print("Nhập giaban: ");
                long giaban=Long.parseLong(sc.nextLine());
                System.out.print("Nhập soluong: ");
                int soluong=Integer.parseInt(sc.nextLine());
                
                list.addEmployee(mahang, tenhang, nhomhang, giaban, soluong);
                System.out.println(list.toString());
                System.out.println(list.toString());
                break;
            }
            case 4: {
                System.out.print("Nhập mahang cần chỉnh : ");
                String mahang = sc.nextLine();
                System.out.print("Nhập ten hang: ");
                String tenhang = sc.nextLine();
                System.out.print("Nhập nhom hang: ");
                String nhomhang = sc.nextLine();
                System.out.print("Nhập gia ban: ");
                long giaban = Integer.parseInt(sc.nextLine());
                System.out.print("Nhập so luong: ");
                int soluong = Integer.parseInt(sc.nextLine());
                list.changehang( mahang,tenhang,nhomhang,giaban,soluong);
                System.out.println(list.toString());
                break;
            }
            case 5: {
                System.out.print("Nhập mã hàng cần xóa: ");
                String mahang = sc.nextLine();
                list.deletehang(mahang);
                System.out.println(list.toString());
                break;
            }
            case 6: {
               System.out.println("Ghi mảng nhân viên xuống file");
               docghifile.writeToFile("dienmay.dat", list.getdienmay());
               break;
            }
            case 7: {
                System.out.println("Đọc danh sách nhân viên từ file");
                dienmay[] arr=docghifile.readFromFile("dienmay.dat");
                list.setdienmay(arr);
                System.out.println(list.toString());
                break;
            }
}
            }while(bc!=0);      
    }
}
