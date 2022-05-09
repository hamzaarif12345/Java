
package self_practise;

public class var_args {
    static void printl(int ...x){
        System.out.println("Taking various argument:");
        for(int y :x){
            System.out.println(y+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
      System.out.println("hey");
      
      printl(3,4,2);
      printl(2);
      printl(3,4);
    }
    
}
