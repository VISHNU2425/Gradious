import java.util.Scanner;
public class Array52{
	public static void main(String...args){
	Scanner s = new Scanner(System.in);
	int n= s.nextInt();
	int sum=0;
	int arr[] = new int[n];
	for(int i =0;i<n;i++){
		arr[i]=s.nextInt();
	}
	for(int i =0;i<n;i++){
		if(arr[i]%2==0){
			System.out.print(arr[i]);
		}
	}
	
	}
}