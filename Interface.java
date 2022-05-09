package Lab_6;
import javax.lang.model.SourceVersion;
public class Interface {
     public static void main(String args[]){
        F a =new F();
        a.method1();
        a.method2();
    }
}
interface  I{
    public void method1();
    public void method2();
}
class F implements I
{
    @Override
    public void method1(){
        System.out.println("Hello from method 1");
    }
    @Override
    public void method2(){
        System.out.println("Hello from method 2");
    }

    
}