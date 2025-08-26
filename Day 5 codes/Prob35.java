import java.util.Scanner;
public class Prob35{
	public static void main(String...args){
	Scanner sc = new Scanner(System.in);
	int n =sc.nextInt();
	int a[]= new int[n];
	for(int i =0;i<n;i++){
		a[i]=sc.nextInt();
	}
	for(int i =0; i <n;i++){
		int count = 0;
		
			if(a[i]>a[i+1]){
				count = count+1;
			
			
		}
		System.out.print(count+" ");
	}
	
	}
}