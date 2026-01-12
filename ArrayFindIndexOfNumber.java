import java.util.*;
public class ArrayFindIndexOfNumber {
public static void main(String[]args) {
	//linear Search
int[] arr= {1,7,0,9};
Scanner sc = new Scanner (System.in);

System.out.println("give me the numer to find");
int a=sc.nextInt();
for(int i=0;i<=arr.length-1;i++) {
	if(arr[i]==a) {
		System.out.println(i);
	}
}


}

}
