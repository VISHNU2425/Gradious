import java.util.*;
 class Pat33{
    public static void main(String...args) {
        Scanner hehe = new Scanner(System.in);
        int x = hehe.nextInt(); 
        double sum = 0;
        for (int i=0;i<x;i++){
            sum=((Math.pow(10,i))+sum);
            System.out.println((int)sum*(i+1));
           
            
           }
       }
    }

