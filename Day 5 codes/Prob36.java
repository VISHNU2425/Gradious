import java.util.Scanner;
public class Prob36{
	public static void main(String...args){
	Scanner sc = new Scanner(System.in);
	int n =sc.nextInt();
	int a[]= new int[n];
	for(int i =0;i<n;i++){
		a[i]=sc.nextInt();
	}
	double []h = new double[100];
	for(int i =0;i<n;i++){
		h[a[i]] += 1;
	}
	for(int i= 1; i<h.length;i++){
		h[i]=h[i]+h[i-1];
			}
	for(int i =0;i<n;i++){
		System.out.print((int)h[a[i]-1] + " ");
	}
  }
}