package Lab_10;
import java.io.FileInputStream;  
public class file3{  
    public static void main(String args[]){    
           try{    
             FileInputStream fin1=new FileInputStream("E:\\SEM 4\\new\\hello.txt");    
              
             byte a []= new byte[100];
             int i =fin1.read(a);
             String str =new String(a);
             System.out.println(str);
             fin1.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
}