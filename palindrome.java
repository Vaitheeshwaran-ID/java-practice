package codingtraining;
import java.util.*;

public class palindrome {
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
int og =sc.nextInt();
int ogdup=og;
int rev=0;
while(og > 0) {
	int dig=og%10;
	rev=rev*10 + dig;
	og/=10;
	
}

if(ogdup==rev) {
	System.out.println("It is a Palindrome");
}else {
	System.out.println("It is not a palindrome");
}
	
	}

}
