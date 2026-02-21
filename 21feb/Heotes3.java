import java.util.*;

public class Heotes3 {
    public static void main(String... args) {
        int a[] = new int[]{-9, 2, -3, 9, 8, 6};
        NumArray na = new NumArray(a);  

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter left index: ");
        int l = sc.nextInt();
        System.out.print("Enter right index: ");
        int r = sc.nextInt();

        System.out.println("Sum from " + l + " to " + r + " = " + na.sumRange(l, r));
    }
}

class NumArray {
    private int[] prefix;

    public NumArray(int[] nums) {
        prefix = new int[nums.length + 1]; 
        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return prefix[right + 1] - prefix[left];
    }
}