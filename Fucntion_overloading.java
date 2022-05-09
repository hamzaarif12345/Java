package Lab_6;
import java.util.Scanner;
public class Fucntion_overloading {
    public static void main(String args[]){
        calc y = new calc();
        Scanner s1 =new Scanner(System.in);
        System.out.println("Press 1 for calculating area of circle \nPress 2 for calculating area of rectangle ");
        System.out.println("Press 3 for calculating area of square \nPress 4 for calculating area of triangle ");
        int g= s1.nextInt();
        if(g==1){
            Scanner s2 =new Scanner(System.in);
            System.out.println("Enter the value of the radius ");
            double v1= s1.nextDouble();
            y.area(v1);
        }
        else if(g==2){
            Scanner s3 =new Scanner(System.in);
            Scanner s4 =new Scanner(System.in);
            System.out.println("Enter the value of the length ");
            int v2 =s3.nextInt();
            System.out.println("Enter the value of the breadth ");
            int v3 =s4.nextInt();
            y.area(v2,v3);
        }
        else if(g==3){
            Scanner s5 =new Scanner(System.in);
            System.out.println("Enter the value of the side of square ");
            int v4 =s5.nextInt();
            y.area(v4);
        }
        else if(g==4){
            Scanner s6 =new Scanner(System.in);
            System.out.println("Enter the value of the side of traingle ");
           float v6 =s6.nextFloat();
            y.area(v6);
        }
        else{
            System.out.println("Wrong choice");
        }
    }
}
class calc{
    int s,a,b;
    double r;
    float t;
    void area(double r){
        double q;
        q = 3.14*r*r ;
        System.out.println("Your are is "+q);
        
    }
    void area(int a, int b){
        int q;
        q=a*b;
        System.out.println("Your are is "+q);
    }
    void area(int s){
        int q;
        q=s*s;
        System.out.println("Your are is "+q);
    }
    void area(float t){
        double q;
        q=0.433*t*t;
        System.out.println("Your are is "+q);
    }
}
