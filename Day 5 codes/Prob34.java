import java.util.Scanner;
public class Prob34{
	public static void main(String...args){
	Scanner sc = new Scanner(System.in);
	int n =sc.nextInt();
	int count = 1;
	int sum = 0;
	while(n!=0){
		int r = n%10;
		System.out.print(r + "^"+count+" ");
		n=n/10;
		count++;
	}
	//System.out.print(sum);
	}
}