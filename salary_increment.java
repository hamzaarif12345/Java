package Lab_6;
import java.util.Scanner;
public class salary_increment {
    public static void main(String args[]){
        Salary1 s=new Salary1();
        s.details();
        s.inc_sal(s);
        s.show_details();
    }
}

class Salary1{
    long  emp_id,salary;
    String name;
    String designation;
    void details(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your employee id");
        emp_id = s.nextLong();
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter your initial salary");
        salary = s1.nextLong();
        Scanner s3 = new Scanner(System.in);
        System.out.println("Enter your name");
        name = s3.nextLine();
        Scanner s4 = new Scanner(System.in);
        System.out.println("Enter your Designation");
        designation = s4.nextLine();
    }
    void inc_sal(Salary1 w){
        if("manager".equals(w.designation) ||"Manager".equals(w.designation)){
            w.salary=w.salary +5000;
        }
        else if("General Manager".equals(w.designation) || "general manager".equals(w.designation)){
            w.salary=w.salary +10000;
        }
        else if("CEO".equals(w.designation) || "ceo".equals(w.designation)){
            w.salary=w.salary +20000;
        }
        else {
            w.salary=w.salary +2000;
        }
    
    }
    void show_details(){
        System.out.println("Your details are :");
        System.out.println("Employee id :"+emp_id);
        System.out.println("Name:"+name);
        System.out.println("Designation:"+designation);
        System.out.println("Your uodated Salary:"+salary);
    }
}