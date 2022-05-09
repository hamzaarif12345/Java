
package self_practise;

import java.util.Scanner;

public class throww {
    public static void main(String args[]){
        try{
            System.out.println("Enter value of dividend:");
            Scanner  s =new Scanner(System.in);
            int a=s.nextInt();
            System.out.println("Enter value of divisor:");
            Scanner  s1 =new Scanner(System.in);
            int b=s1.nextInt();
            if(b==0){
                
                throw new ArithmeticException("divide by zero");
            }
        }catch(ArithmeticException e){
            System.out.println("Exception caught:");
            System.out.println(e);
        }finally{
            System.out.println("hello");
        }
    }
        
}
