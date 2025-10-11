import java.util.*;
public class Day71{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int [][]arr = new int[n][n];
		for(int i = 0 ; i < n ; i++){
			for(int j = 0;j < n ; j++){
				arr[i][j]= sc.nextInt();
			}
		}
		int k = 0 ;
		int l = 0 ;
		int lol=0;
		
			for(int i = 0 ; i < n;i++){
				for(int j = i ;j<n;j++){
					if(i==j){
						k=k+arr[i][j];
					}
					else {
						l=l+arr[i][j];
						lol = lol+arr[j][i];
					}
				}
			}
			System.out.println("The sum in box 1"+k);
			System.out.println("The sum in box 2"+l);
			System.out.println("The sum in box 3"+lol);
}
}