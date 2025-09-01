import java.util.Scanner;
public class Prob44{
	public static void main(String...args){
	Scanner s = new Scanner(System.in);
	int n= s.nextInt();
	int a=0;
	int b=1;
	int c=0;
	
	for(int i=0;i<n;i++){
		c=a+b;
		a=b;
		b=c;
		if(i<n-1){

		
		System.out.print(3*c+",");
	}else{
		System.out.print(3*c);
	}
	}
	}
}