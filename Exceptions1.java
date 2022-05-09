package Lab_9;
import java.util.Scanner;
public class Exceptions1{
   
   int age;
   public Exceptions1(int age){
      try {
         if (age<17||age>24) {
            String msg = "Age is not between 17 and 24";
            AgeDoesnotMatchException ex = new AgeDoesnotMatchException(msg);
            throw ex;
         }
      }
      catch(AgeDoesnotMatchException e) {
         e.printStackTrace();
      }finally{
          System.out.println("hello");
      }
      
   }  
   
   public static void main(String args[]) {
      
      
      Exceptions1 obj = new Exceptions1 (15);
      
   }
}
class AgeDoesnotMatchException extends Exception{
   AgeDoesnotMatchException(String msg){
       super(msg);
   }
}