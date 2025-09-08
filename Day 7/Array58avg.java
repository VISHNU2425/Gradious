import java.util.Scanner;
public class Array58avg{
	public static void main(String...args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int a[]=new int[n];
	for(int i =0 ; i<n ; i++){
		a[i]=sc.nextInt();
	} 
	int hehe =0;
	for(int i = 0 ; i < n; i++){
	    hehe=hehe+a[i];
	}
	System.out.print("Average of the elements in the array = " +(float) hehe/n);
	}
}