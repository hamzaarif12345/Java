package Lab_6;
import java.util.Scanner;
public class Abstract_class {
    public static void main(String args[]){
        B b= new B();
        b.area();
        C c =new C();
        c.area();
    }
}
abstract class A{
    abstract void area();
}
class B extends A{
    @Override
    void area(){
        System.out.println("Enter the value of radius :");
        Scanner s= new Scanner(System.in);
        double r= s.nextDouble();
        double q= 3.14*r*r;
        System.out.println("Your area is : "+q);
    }

}
class C extends A{
    @Override
    void area(){
        System.out.println("Enter the value of side of square :");
        Scanner s= new Scanner(System.in);
        double r= s.nextDouble();
        double q= r*r;
        System.out.println("Your area is : "+q);
    }
}