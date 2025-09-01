import java.util.Scanner;
public class Pat45{
	public static void main(String...args){
	Scanner s = new Scanner(System.in);
	int n= s.nextInt();
	for(int i=0;i<2*n-1;i++){
		for(int j=0;j<2*n-1;j++){
			if((2*n-1)>(i+j)){
				System.out.print(n-Math.min(i,j) +" ");
			}else{
				System.out.print(Math.max(i,j)-n+2 +" ");
			}
		}
		System.out.println();
	}

	
	}
}