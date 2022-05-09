
package self_practise;

public class exceptions {
    public static void main(String args[]){
        try{
            int a=100;
            int b=0;
            int c;
            c= a/b;
        }catch(Exception e){
            System.out.println("Exception caught:");
            System.out.println(e);
        }finally{
            System.out.println("hello");
        }
    }
        
}
