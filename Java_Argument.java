package pkg4cse2y;
import java.util.Scanner;
public class Java_Argument{
    public static void main(String[] args) {
        /*System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[1]);
        System.out.println(args[1]);
        System.out.println(args[1]);*/
        
        
        Scanner ob =new Scanner(System.in);
        System.out.println("Enter your name:");
        String s =ob.nextLine();
        System.out.println("Enter your age:");
        int i =ob.nextInt();
        System.out.println(" your name:"+s);
        System.out.println("your age:"+i);

    }
    
}
