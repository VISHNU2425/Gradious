import java.util.*;
public class Sorto6{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[]=new int[n];
		for(int i:a){
			a[i]=sc.nextInt();
		}
		int[] c = new int[100];
		for(int i = 0;i<n;i++){
			c[a[i]]++;
		}
		int f=0;
		int lol;
		while(f==0){
			lol = sc.nextInt();
			if(lol>7){
				f=1;
			}
		}
	}
}
