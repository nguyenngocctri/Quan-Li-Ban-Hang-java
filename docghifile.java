/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktgk;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Administrator
 */
public class docghifile {
    public static dienmay[] readFromFile(String filename) {
        dienmay obj[]  = null ;
        dienmay[] pb = null ;
        try {
            FileInputStream f = new FileInputStream(filename) ;
            ObjectInputStream ois= new ObjectInputStream(f);
            obj = new dienmay[20];
            int i = 0 ;
            while(f.available()>0){
               obj[i] =  (dienmay) ois.readObject();  
               i++ ;
            }
            pb = new dienmay[i] ;
            for(int j=0;j<i;j++){
                pb[j] = obj[j] ;
            }
            System.out.println("Đã đọc xong");
            f.close();
            ois.close();
            
        }
        catch (IOException ex) {
            ex.printStackTrace();
        } 
        catch (ClassNotFoundException ex) {
            ex.printStackTrace(); 
        }
       return pb ;
    }
    public static boolean hasObject(String filename) {
        FileInputStream fi;
	boolean check = true;
	try {
            fi = new FileInputStream(filename);
            ObjectInputStream inStream = new ObjectInputStream(fi);
            if (inStream.readObject() == null) {
		check = false;
            }
            inStream.close();
            } catch (FileNotFoundException e) {
                check = false;
            } catch (IOException e) {
                check = false;
            } catch (ClassNotFoundException e) {
                check = false;
                e.printStackTrace();
            }
            return check;
	}

    public static void writeToFile(String filename, dienmay obj[]){
        FileOutputStream fout = null;
	ObjectOutputStream oos = null;
	try {
            if(!hasObject(filename)){
                fout = new FileOutputStream(filename);
                oos = new ObjectOutputStream(fout);
            } 
            else {
                fout = new FileOutputStream(filename, true);
                oos = new ObjectOutputStream(fout) {
                @Override
                protected void writeStreamHeader() throws IOException {
                        reset();
                }
                };
            }
            for(int i=0;i<obj.length;i++){
                oos.writeObject(obj[i]);
            }
            fout.close();
            oos.close();
            System.out.print("Xong!");
        }catch (IOException ex) {
            ex.getMessage();return;
        }  
        
    }
}
