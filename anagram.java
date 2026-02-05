
import java.util.Arrays;

public class _040526_2 {

	public static void main(String[] args) {
	String s="dad";
	String s1="add";
	if(s.length()!=s1.length()) {
		System.out.println("no");
	}else {
		char []a=s.toCharArray();
		char []b=s1.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(Arrays.equals(a,b)?"Yes":"No");
			
		}

	}
