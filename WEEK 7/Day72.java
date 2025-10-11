import java.util.Scanner;
import java.util.Arrays;
public class Day72 {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of repetitions: ");
        int lol = sc.nextInt();
        lol = lol % n;
        int h[] = new int[n];             
        for (int i = 0; i < n; i++) {
            h[(i + lol) % n] = arr[i];
        }
        System.out.println("Rotated array: " + Arrays.toString(h));
    }
}
