package Lab_7;
import java.util.Scanner;
public class FInal_class {
    public static void main(String args[]){
        newest n= new newest();
        n.method();
    }
}
final class newest{
    final int a=100;
    final String a1="Tommy";
    final int a2=12;
    final String a3="U.S.A.";
    final void method(){
        System.out.println("Your emp id is "+a);
        System.out.println("Your name is "+a1);
        System.out.println("Your sector is "+a2);
        System.out.println("Your country is "+a3);
    }
}