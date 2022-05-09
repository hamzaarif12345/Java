package self_practise;
import java.util.Scanner;
public class fcfs {
    public static void main(String args[]){
        f1 a =new f1();
        a.input();
        a.tatat();
        a.wt();
    }
}

class f1{
    int p[] =new int[100];
    int f[] =new int[100];
    int finish[] =new int[100];
    int tat[]=new int [100];
    int wt[]=new int [100];
    int k;
    void input(){
        System.out.println("welcome ot fcfs :");
        
        System.out.println("enter how many values to be entered ?");
        Scanner s=new Scanner(System.in);
        k=s.nextInt();
        for(int i=0;i<k;i++){
            System.out.println("enter the entry time of process"+(i+1));
            Scanner s1=new Scanner(System.in);
            p[i]=s.nextInt();
            System.out.println("enter the burst time of process"+(i+1));
            Scanner s2=new Scanner(System.in);
            f[i]=s.nextInt();
 
        }
        finish[0]=p[0]+f[0];
        for(int j=1;j<k;j++){
            finish[j]=finish[j-1]+f[j];
        }
        
   
    }
    void tatat(){
        for(int j=0;j<k;j++){
            tat[j]=finish[j]-p[j];
        }
        float avg =0;
        for(int j1=0;j1<k;j1++){
            avg =avg+tat[j1];
        }
        System.out.println("Average tat is :"+(avg/k));
    }
    void wt(){
        for(int j=0;j<k;j++){
            wt[j]=tat[j]-f[j];
        }
        float avg =0;
        for(int j1=0;j1<k;j1++){
            avg =avg+wt[j1];
        }
        System.out.println("Average tat is :"+(avg/k));
    }
}