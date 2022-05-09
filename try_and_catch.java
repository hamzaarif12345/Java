package Lab_8;

public class try_and_catch {
    public static void main(String args[]){
        try{
            System.out.println(divide(20,4));
            System.out.println(divide(20,0));
        }
        catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
    }
    public static int divide(int x,int y){
        return x / y;
    }
   
}
