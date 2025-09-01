import java.util.Scanner;
public class Pat42{
	public static void main(String...args){
	Scanner s = new Scanner(System.in);
	int n= s.nextInt();
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			if(i==0 ||i==(n-1)||j==0||j==(n-1)){
				System.out.print("* ");
			}else if(i==1||i==(n-2)||j==1||j==(n-2)){
				System.out.print("$ ");
			}else{
				System.out.print("  ");
			}
		}
		System.out.println();
	}

	
	}
}