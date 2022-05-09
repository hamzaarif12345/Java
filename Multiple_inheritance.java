package Lab_7;
import java.util.Scanner;
public class Multiple_inheritance {
    public static void main(String args[]){
        I i1 =new I();
        i1.hello();
        i1.hello2();
    }
    
   
    
}
interface A{
        String name1="Hamza";
        public void hello();
        
    }
interface B{
        String address= "Delhi";
        public void hello2();
        
    }
class I implements A,B{
    @Override
    public void hello(){
        System.out.println("From interface of A");
        //Scanner q= new Scanner(System.in);
        //System.out.println("Enter your name:");
        //name1 =q.nextLine();
        System.out.println("Your name is :"+name1);
    }
    @Override
    public void hello2(){
        System.out.println("From interface of B");
        //Scanner q2= new Scanner(System.in);
        //System.out.println("Enter your address:");
        //address =q2.nextLine();
        System.out.println("Your address is :"+address);
    }
}