import java.util.HashSet;

public class Hashing1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,5,6,7,8,9,8,7,6,6,6,5};

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> printed = new HashSet<>();

        for (int n : arr) {
            if (seen.contains(n) && !printed.contains(n)) {
                System.out.println("Duplicate: " + n);
                printed.add(n); // mark it as already reported
            }
            seen.add(n);
        }
    }
}
