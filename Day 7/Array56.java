import java.util.Scanner;
public class Array55{
	public static void main(String...args){
	Scanner sc = new Scanner(System.in);
	int n =sc.nextInt();
	int a[]= new int[n];
	int res[]=new int[n];
	for(int i =0;i<n;i++){
		a[i]=sc.nextInt();
	}
	int k=0;
	int []h = new int[101];
	for(int i =0;i<n;i++){
		if(h[a[i]]==0){
			res[k++]=a[i];
		}
		h[a[i]] += 1;
	  }
	
	for(int i =0;i<k;i++){
		System.out.println( res[i]+" repeated :" + h[res[i]] + " ");
	}
  }
}