package Lab_10;
import java.io.FileOutputStream;  
public class file{  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("E:\\SEM 4\\new\\hello.txt");    
             fout.write(65);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
}  