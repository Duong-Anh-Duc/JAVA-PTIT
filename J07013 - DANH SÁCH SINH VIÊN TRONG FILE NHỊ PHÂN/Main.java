package danhsachsinhvien1;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.ParseException;
import java.util.*;
public class Main{
       public static void main(String[] args) throws IOException, ClassNotFoundException, ParseException{
       ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SV.in"));
       ArrayList<SinhVien> a = (ArrayList<SinhVien>) ois.readObject();
       for(SinhVien x : a){
           System.out.println(x);
       }
    }
 }


