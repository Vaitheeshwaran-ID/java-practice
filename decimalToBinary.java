package codingtraining;

public class binary {

	public static void main(String[] args) {
		
		int n=1;
		String s="";
		while(n>0) {
			int rem=n%2;
			s=rem+s;
			n=n/2;
		}
		System.out.println(s);

	}

}
