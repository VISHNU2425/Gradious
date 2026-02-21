import java.util.Arrays;
public class Rigze{
	public static void main(String...args){
		int arr[]={1,2,0,0,0,4,0,1,0,5,0};
		int k = 0 ;
		int n = arr.length;
		int h []= new int[n];
		int haha=0;
		for(int i = 0 ; i< n ;i++){
			if(arr[i]>0||arr[i]<0){
				h[k++]=arr[i];
			}
			if(arr[i]==0)haha++;
		}
		System.out.println(Arrays.toString(h));
		System.out.println();
		
		int hehe[]=new int[n];
		for(int i = 0; i < n ; i++){
			if(arr[i]>0||arr[i]<0){
				hehe[haha++]=arr[i];
			}
		}
		System.out.println(Arrays.toString(hehe));
		Arrays.sort(arr);
		System.out.println();
		int ki = 0 ;
		int hol []= new int[n];
		int hah=0;
		for(int i = 0 ; i< n ;i++){
			if(arr[i]>0||arr[i]<0){
				hol[ki++]=arr[i];
			}
			if(arr[i]==0)hah++;
		}
		System.out.println(Arrays.toString(hol));
		System.out.println();
		int heh[]=new int[n];
		for(int i = 0; i < n ; i++){
			if(arr[i]>0||arr[i]<0){
				heh[hah++]=arr[i];
			}
		}
		System.out.println(Arrays.toString(heh));
	}
}