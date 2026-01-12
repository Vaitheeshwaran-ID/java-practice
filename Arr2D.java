
import java.util.*;
public class Arr2D {

	public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int [][]arr=new int[a][b];

for(int i=0;i<a;i++) {
	for(int j=0;j<b;j++) {
		arr[i][j]=sc.nextInt();
	}
}
for(int i=0;i<a;i++) {
	for(int j=0;j<b;j++) {
System.out.print(arr[i][j]);
}
	System.out.println("");}

	
System.out.println("Type the Number to Search");
int c = sc.nextInt();
for(int i=0;i<a;i++) {
	for(int j=0;j<b;j++) {
		if(arr[i][j]==c) {
			System.out.print(i + ",");
			System.out.print(j + " ");

		}
		else {
			System.out.print("Number not Found ");

		}
}
	}
}

}
