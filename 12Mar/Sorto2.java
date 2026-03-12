import java.util.Arrays;
class Sorto2{
	public static void main(String...args){
		int a[]=new int[]{4,8,2,1,7,8,6};
		Arrays.sort(a);
		int n = a.length;
		int s= 0 ;

		for(int i = 0; i< n;i++){
			s=s+(int)(a[i]*Math.pow(10,i));	
		}
		System.out.print(s);
	}
}