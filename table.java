package pkg4cse2y;
import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        System.out.println("Welcome to table manipulation");
        Scanner ob =new Scanner(System.in);
        
        System.out.println("Enter the number:");
        int n =ob.nextInt();
        System.out.println("Your table is");
        for(int i=1;i<=10;i++)
        {  
            System.out.println(i*n);
        }
    }
}