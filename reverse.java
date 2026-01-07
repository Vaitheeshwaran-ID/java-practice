import java.util.*;
public class reverse{
public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    int rev=0;
    int a=sc.nextInt();
    while(a!=0){
        int num=a%10;
        rev = rev *10 +num;
        a=a/10;
    }
    System.out.println(rev);
    
    
}}
