import java.util.*;
public class Day81{
	public static void main(String...args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[]=new int[n];
	int h[]=new int[n];
	
	for(int i = 0 ; i < n ; i++){
		arr[i]=sc.nextInt();
	}
	int k = 0 ;

	for(int i = 0 ; i < n ; i++){
		int f = 0;
		for(int j = 0 ; j < n ; j++){
			if(arr[i]==h[j]){
				f=1;
				break;
			}
		}
		if(f==0){
			h[k++]=arr[i];
		}
	}
	System.out.print(Arrays.toString(h));

		System.out.println();

		System.out.print(Arrays.toString(Arrays.copyOfRange(h,0,k)));
	
	}
}