//important program
package Lab_7;
public class Comparable_class {
    public static void main(String args[]){
        int x;
        q q1 =new q(300);
        q q2 =new q(2000);
        x= q1.compareTo(q2);
        System.out.println(x);
    }
}

class q implements Comparable<q>{
    int marks;
    q(int a){
        this.marks=a;
    }
    @Override
    public int compareTo(q oq){
        return this.marks >= oq.marks ? 1:0;
    }
}