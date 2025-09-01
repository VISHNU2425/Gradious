import java.util.Scanner;
public class Prob45{
	public static void main(String...args){
	Scanner s = new Scanner (System.in);
	int n = s.nextInt();
	int a=0;
	int b=1;
	int c;
	int co=0;
	for(int i=0;i<n;i++){
		c=a+b;
		a=b;
		b=c;
		if(a%2==0){
			if(i<n-2){
				System.out.print(a +" ");
			}
			}
   		}
	}
}