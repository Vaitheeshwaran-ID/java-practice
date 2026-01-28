package codingtraining;

public class _28_01_2026 {

	public static void main(String[] args) {
int n=76;
int a=n*n;
int b=(n+"").length();
int ld=a %(int)(Math.pow(10, b));
	System.out.println((ld==n)?"auto":"not");	
}			
		}
