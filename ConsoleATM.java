package codingtraining;
import java.util.*;
public class ATM_Machine {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Welcome to ATM");
		System.out.println("Enter the phonenumber");
		Long PhoneNumber =sc.nextLong();
		System.out.println("Enter the pin");
		int pass = sc.nextInt();
		int balance=1000;
		int rebalance=0;
		Long OgPhoneNumber=12L;
		int Ogpass=2345;
		
		if((OgPhoneNumber==PhoneNumber)&&(Ogpass==pass )) {
			System.out.println("Enter 0 - Deposit"+"");
			System.out.println("Enter 1 - Withdraw money"+"");
			System.out.println("Enter 2 - Check balance"+"");
			System.out.println("Enter 3 - Exit"+"");
			int a=sc.nextInt();
			switch(a) {
			case 0:{
				System.out.println("Enter amount you deposit");
				int add=sc.nextInt();
				rebalance=balance+add;
				
				System.out.println("Amount added to account:"+add);
				System.out.println("Current balance:"+rebalance );
				break;
				}
			case 1:
			{
				System.out.println("Enter amount you withdraw");
				int with=sc.nextInt();
				if(with<=balance) {
				rebalance=balance-with;
				
				System.out.println("Amount withdrawed account:"+with);
				System.out.println("Current balance:"+rebalance );}
				else {
					System.out.println("insuffficient balance");
				}
				break;
			}
			case 2:
			{				
				System.out.println("Current balance:"+ rebalance );
				break;
			}
				
			case 3:
			{
			System.out.println("Thank you");
				break;
			}
			}
		}
		else {
			System.out.println("Wrong credintials,Try Again");
		}
		
	}
	


}
