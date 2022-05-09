package Lab_7;
import java.util.Scanner;
public class Motorbike_and_cycle {
    public static void main(String args[]){
        Doi d = new Doi();
        d.distance();
        d.speed();
        d.distance1();
        d.speed1();
        d.stats();
    }
}
interface motorbike{
    void speed();
    void distance();
}
interface cycle{
    void speed1();
    void distance1();
}
class Doi implements motorbike,cycle{
    int s,d,a,f,t1,t2,s2;
    @Override
    public void distance(){
        System.out.println("Enter the distance covered by motorbike");
        Scanner w =new Scanner(System.in);
        d= w.nextInt();
        System.out.println("Enter the time taken by motorbike");
        Scanner w1 =new Scanner(System.in);
        t1= w1.nextInt();
    }
    @Override
    public void speed(){
        s=d/t1;
    }
    @Override
    public void distance1(){
        System.out.println("Enter the distance covered by cycle");
        Scanner w =new Scanner(System.in);
        a= w.nextInt();
        System.out.println("Enter the time taken by cycle");
        Scanner w1 =new Scanner(System.in);
        t2= w1.nextInt();
    }
    @Override
    public void speed1(){
        s2=a/t2;
    }       
    void stats(){
        System.out.println("Distance covered by motorbike"+d);
        System.out.println("Speed of the motorbike"+s);
        System.out.println("Distance covered by cycle"+a);
        System.out.println("Speed of the motorbike"+s2);
        
    }
    
}