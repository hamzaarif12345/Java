package Lab_10;
package javaapplication18;

import java.io.FileOutputStream;  
public class file2{  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("E:\\SEM 4\\new\\hello.txt");    
             String s ="welcome boy";    
             byte b[]=s.getBytes();
             fout.write(b);
             fout.close();
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
} 
