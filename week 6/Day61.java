import java.util.Scanner;
public class Day61{
	public static void main(String...args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int arr[][]=new int[a][b];
	for(int i = 0 ; i < a;i++ ){
		for(int j = 0 ; j < b;j++){
				arr[i][j]=sc.nextInt();
				
		}
	}
	System.out.print("ENTER THE KEY VALUE:");
	int sea=sc.nextInt();
	for(int i = 0 ; i < a;i++ ){
		
		for(int j = 0 ; j < b;j++){
				if(arr[i][j]==sea){
					System.out.print("KEY IS AT "+(i)+(j) );
					break;
				}


		}
		  
	}
	System.out.print("KEY NOT FOUND");
	}
}