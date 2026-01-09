import java.util.*;
public class Fibonacci{
    public static void  main (String[]args){
        Scanner c = new Scanner (System.in);
        int n =c.nextInt();
        int a=0,b=1;
        System.out.println(a+" "+b);
        for(int i =2; i<n;i++){
            int c = a + b;
            System.out.println(" "+c);
            a=b;
            b=c;
        }
    }
}
