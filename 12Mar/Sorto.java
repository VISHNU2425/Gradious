import java.util.Arrays;q
public class Sorto{
	public static void main(String...args){
	int h[]= new int[]{12,34,12,3,2,3,4,6,37};
	int n = h.length;
	int max = 0;
	for(int i = 0;i< n-1;i++){
		if(h[i]>h[i+1]){
		max=h[i];
		}else{
		max=h[i+1];
		}
	} 
	System.out.println(max);
	Arrays.sort(h);
	System.out.print(h[n-1]);
	}
}