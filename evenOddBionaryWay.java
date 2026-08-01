import java.util.*;
public class Main{
  public static boolean Convert(int n){
if((n&1)==0){
return true;
}else{
return false;
}
    
  }
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  System.out.println(  Convert(n));
  }
}
