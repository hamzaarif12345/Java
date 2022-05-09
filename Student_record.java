package Lab_6;
import java.util.Scanner;
public class Student_record {
    public static void main(String args[]){
        srecord s= new srecord();
        s.getdata();
        s.setdata();
        s.display();
    }
    
}
class srecord{
    int marks1,marks2,marks3,roll_no;
    String name;
    int a,b,c, d;
    String e;
    void getdata(){
        System.out.println("Enter the roll number of the student");
        Scanner f= new Scanner(System.in);
        a = f.nextInt();
        System.out.println("Enter the name of the student");
        Scanner f5= new Scanner(System.in);
        e = f5.nextLine();
        System.out.println("Enter the marks in English");
        Scanner f2= new Scanner(System.in);
        b = f2.nextInt();
        System.out.println("Enter the marks in Hindi");
        Scanner f3= new Scanner(System.in);
        c = f3.nextInt();
        System.out.println("Enter the marks in Science");
        Scanner f4= new Scanner(System.in);
        d = f4.nextInt();
    }
    void setdata(){
        this.roll_no=a;
        this.marks1=b;
        this.marks2=c;
        this.marks3=d;
        this.name=e;
    }
    void display(){
        System.out.println("\nThe details are:");
        System.out.println("The roll number of the student is ");
        System.out.println(roll_no);
        System.out.println("The name of the student is ");
        System.out.println(name);
        System.out.println("The marks in English of the student is ");
        System.out.println(marks1);
        System.out.println("The marks in Hindi of the student is ");
        System.out.println(marks2);
        System.out.println("The marks in Science of the student is ");
        System.out.println(marks3);
        
    }
    
}