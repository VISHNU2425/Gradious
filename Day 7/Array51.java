import java.util.Scanner;
public class Array51{
	public static void main(String...args){
	Scanner s = new Scanner(System.in);
	int n= s.nextInt();
	int sum=0;
	int arr[] = new int[n];
	for(int i =0;i<n;i++){
		arr[i]=s.nextInt();
		sum = sum+arr[i];
	}
	System.out.print(sum);
	}
}