import java.util.*;

public class Sorto4{
    public static void main(String[] args) {
        int n = 7;
        int arr[] = {4, 8, 2, 1, 7, 8, 6};

        int originalFirst = arr[0]; 
        String[] strArr = new String[n];
        for (int i = 0; i < n; i++) {
            strArr[i] = String.valueOf(arr[i]);
        }
        Arrays.sort(strArr, (a, b) -> b.compareTo(a));
        StringBuilder sb = new StringBuilder();
        for (String s : strArr) {
            sb.append(s);
        }
        System.out.println(sb.toString()); System.out.println(originalFirst);   
    }
}
/* class SortoDynamic {
    public static void main(String[] args) {
        int arr[] = {4, 8, 2, 1, 7, 8, 6};
        int n = arr.length;
        int originalFirst = arr[0];

        // Parameters: choose largest/smallest and number of digits
        boolean largest = true;   // true → largest, false → smallest
        int digitsNeeded = 5;     // how many digits to use in result

        // Convert to strings
        String[] strArr = new String[n];
        for (int i = 0; i < n; i++) {
            strArr[i] = String.valueOf(arr[i]);
        }

        // Sort dynamically
        if (largest) {
            Arrays.sort(strArr, (a, b) -> b.compareTo(a)); // descending
        } else {
            Arrays.sort(strArr, (a, b) -> a.compareTo(b)); // ascending
        }

        // Build result with required digits
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Math.min(digitsNeeded, n); i++) {
            sb.append(strArr[i]);
        }

        // Output
        System.out.println("Result: " + sb.toString());
        System.out.println("Original first element: " + originalFirst);
    }
}
*/