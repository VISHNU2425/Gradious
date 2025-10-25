import java.util.*;
public class Day82{
	public static void main(String...args){
	StringBuilder str = new StringBuilder("Hello");
	System.out.println(str);
	System.out.println(str.append("123"));
	System.out.println(str);
	str.insert(5,"abc");
	System.out.println(str);


	}
}