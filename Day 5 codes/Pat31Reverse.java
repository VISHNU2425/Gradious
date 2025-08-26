import java.util.Scanner;

public class Pat31Reverse {
    public static void main(String... args) {
        Scanner hehe = new Scanner(System.in);
        int n = hehe.nextInt();

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print((char) ('a' + k));
            }
            for (int l = i; l > 0; l--) {
                System.out.print((char) ('a' + l - 1));
            }

            System.out.println();
        }
    }
}