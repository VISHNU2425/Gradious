import java.util.Scanner;
public class Array55{
	public static void main(String...args){
	Scanner sc = new Scanner(System.in);
	int n =sc.nextInt();
	int a[]= new int[n];
	for(int i =0;i<n;i++){
		a[i]=sc.nextInt();
	}
	int []h = new int[100];
	for(int i =0;i<n;i++){
		h[a[i]] += 1;
	}
	for(int i= 1; i<h.length;i++){
		h[i]=h[i]+h[i-1];
			}
	for(int i =0;i<n;i++){
		System.out.print(h[a[i]-1] + " ");
	}
  }
}