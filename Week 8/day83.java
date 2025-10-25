import java.util.*;
public class Day83{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
	StringBuilder str = new StringBuilder(sc.nextLine());
	int n = str.length();
	int k =0;
	for(int i =0 ;i<n;i++){
		char ch = str.charAt(i);
		if(ch=='a'||ch=='e'||ch.charAt(i)=='i'||ch.charAt(i)=='o'||ch.charAt(i)=='u'){
			k++;
		}
	}
	System.out.print(k);

	}
}