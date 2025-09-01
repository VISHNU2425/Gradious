import java.util.Scanner;
public class Prob46{
	public static void main(String...args){
	Scanner s = new Scanner (System.in);
	int n=s.nextInt();
	int term=n;
	int a[]= new int[100];
	for(int i =0;i<n;i++){
		a[i]=term*(term-1);
		term=a[i];
	}
	for(int i =0;i<n;i++){
		System.out.print(a[i] +" ");
	}

	}
}