import java.util.Scanner;
public class Pat43{
	public static void main(String...args){
	Scanner s = new Scanner(System.in);
	int n= s.nextInt();
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			if(n<=(i+j)){
				System.out.print(Math.max(i,j)+1 +" ");
			}else{
				System.out.print(n-Math.min(i,j) +" ");
			}
		}
		System.out.println();
	}

	
	}
}