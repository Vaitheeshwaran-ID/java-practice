import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int og =s.nextInt();
        
        int ogdup=og;
        int num=og;
        int rev=0;
        while(og>0){
            int dig=og%10;
            rev=rev*10+dig;
            og/=10;
        }
        if(rev==ogdup){
            System.out.println("yes palindrome");
        }else{
            System.out.println("Not a palindrome");
        
            }
        
    }}

