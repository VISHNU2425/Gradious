import java.util.Arrays;
public class Array53{
	public static void main(String...args){
	int []arr={5,8,7,3,4,5,6};
	int []arr1=Arrays.copyOf(arr,arr.length);
	for(int i =0;i<arr.length;i++){
		System.out.print(arr[i]+arr[arr.length-i-1]+" ");
	}
	
	}
}