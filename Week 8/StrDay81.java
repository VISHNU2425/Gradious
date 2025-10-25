import java.util.*;
public class StrDay81{
	public static void main(String...args){
	String str = "hello";
	System.out.println(str.length());
	System.out.println(str.charAt(1));
	System.out.println(str.indexOf("ell"));
	System.out.println(str.lastIndexOf("l"));
	System.out.println(str.replace("l","p"));
	System.out.println(str);
	System.out.println(str.toUpperCase());
	String s1="hello";
	String s2="HELLO";
	System.out.println(s1.equals(s2));
	System.out.println(str.equalsIgnoreCase(s2));
	String s3="         hiiiiiiii  hi hi    ";
	System.out.println(s3);
	System.out.println(s3.trim());
	System.out.println(s3.replaceAll("\\s+"," "));
	System.out.println(s3.trim());
	String s4=" Spaces";
	System.out.println(Arrays.toString(s4.split(" ")));
	//System.out.println(Arrays.toString(s4.split("a")));
	System.out.println(s4);
	String[] words = s4.split(" ");
        
        // Print the array using Arrays.toString
        System.out.println(Arrays.toString(words));
     String h = "hello";
     String hehe[]=(h.split(""));
     int k = 0 ; 
     for(int i = 0 ; i<str.length();i++){
     	if(hehe[i]=="l"){
     		k++;
     	}

     }
        System.out.print(k);


	}
}