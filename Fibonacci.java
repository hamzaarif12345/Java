package pkg4cse2y;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Welcome to fibonacci");
        Scanner ob =new Scanner(System.in);
        
        System.out.println("Enter the number:");
        int n =ob.nextInt();
        System.out.println("Your series is");
        int firstTerm = 0, secondTerm = 1;
        for (int i = 1; i <= n; ++i) 
        {
            System.out.print(firstTerm + ", ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
    
}
