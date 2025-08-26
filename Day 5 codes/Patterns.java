import java.util.Scanner;


 class Pat33{
    public static void main(String...args) {
        Scanner hehe = new Scanner(System.in);
        int x = hehe.nextInt(); 
        for (int i = x; i > 0; i--) {
            for (int j = 0; j < i; j++) 
                System.out.print(j+1+" ");
                System.out.println("");
            }
            for ( int i = 1; i<x; i++) {
                for(int j=0;j<=i;j++)
                System.out.print((j+1)+" ");
            System.out.println("");
                
            }   
        }
    }

