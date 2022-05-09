package Lab_9;
package javaapplication22;
public class Threads{
    public static void main(String args[]){
        a1 a =new a1();
        q1 q =new q1();
        Thread m =new Thread(q);
        m.start();  // i9mportant lines
        a.start();   // no sequential order
    }
}
class a1 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("hello"+(i+1));
        }
    }
}
class q1 implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("bye"+(i+1));
        }
    }
    

}