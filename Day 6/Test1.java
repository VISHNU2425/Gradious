import java.util.Scanner;
public class Test1{
	public static void main(String...args){
	Scanner s = new Scanner(System.in);

	int n=s.nextInt();
	for(int i=0;i<n;i++){
		for(int j=n-i;j>0;j--){
			System.out.print("*");
		}
		for(int k=0;k<=i;k++){
			System.out.print((k+1)+" ");
		}
		for(int j=n-i;j>0;j--){
			System.out.print("*");
		}
		System.out.println();
	}
	}
}