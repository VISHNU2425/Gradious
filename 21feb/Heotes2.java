//write a program to get integer array elements to find the sum of right side elements
import java.util.Arrays;
public class Heotes2{
	public static void main(String...args){
	int arr[] = new int[]{1,2,3,4,5};
	int n = arr.length;
	int s = 0;
	int h[]=new int[n];
	for(int i = 0 ; i< n ; i++){
			int hmm = 0;
			for(int j = i ; j < n-1;j++){
				hmm=hmm+arr[j+1];
			}
			h[i]=hmm;
	}
	System.out.println(Arrays.toString(h));
	}
}