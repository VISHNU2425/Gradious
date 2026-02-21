import java.util.*;

public class Heotes4 {
    public static void main(String... args) {
        int nums[] = new int[]{10, 4, 8, 3};
        int n = nums.length;
        int lef[] = new int[n];
        int lesu = 0;
        for (int i = 0; i < n; i++) {
            lef[i] = lesu;
            lesu += nums[i];
        }
        System.out.println( Arrays.toString(lef));
        int rig[] = new int[n];
        int risu = 0;
        for (int i = n - 1; i >= 0; i--) {
            rig[i] = risu;
            risu += nums[i];
        }
        System.out.println( Arrays.toString(rig));
        int lol[] = new int[n];
        for (int j = 0; j < n; j++) {
            lol[j] = Math.abs(lef[j] - rig[j]);
        }
        System.out.println( Arrays.toString(lol));
    }
}