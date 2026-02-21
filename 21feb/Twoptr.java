import java.util.*;

public class Twoptr {
    static int[] tfin(int arr[], int target) {
        Arrays.sort(arr);
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int sum = arr[l] + arr[r];
            if (sum == target) {
                return new int[]{arr[l], arr[r], target};
            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }
        return new int[]{};
    }

    public static void main(String... args) {
        int p[] = {111, 22, 67, 106, 69, 96};
        Integer pr[] = new Integer[p.length];
        int[][] k = {{2, 4}, {6, 7}, {1, 5}};

        for (int i = 0; i < p.length; i++) {
            pr[i] = p[i];
        }

        Arrays.sort(pr, new Five());
        System.out.println("Sorted pr (descending): " + Arrays.toString(pr));

        Arrays.sort(k, new Seven());
        System.out.println("Sorted k (by first element): " + Arrays.deepToString(k));

        int[] result = tfin(p, 173);
        if (result.length > 0) {
            System.out.println("Pair and target found: " + Arrays.toString(result));
        } else {
            System.out.println("No pair found");
        }
    }
}

class Five implements Comparator<Integer> {
    public int compare(Integer a, Integer b) {
        return b - a;
    }
}

class Seven implements Comparator<int[]> {
    public int compare(int[] a, int[] b) {
        return a[0] - b[0];
    }
}
/*
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Four {
    static int[] ts2(int arr[], int target)
    {
        int[][] work= new int[arr.length][2]; 
        for(int i = 0; i < arr.length; i++)
        {
            work[i][0] = arr[i];
            work[i][1] = i;
        }

        Seven compObj = new Seven(); 
        Arrays.sort(work, compObj); 

        int i = 0; 
        int j = arr.length - 1; 

        while (i < j) {
            int sum = work[i][0] + work[j][0]; 
            if( sum == target)
            {
                // return new int[]{}
                return new int[]{work[i][1], work[j][1]};
            }
            else if( sum > target)
            {
                j--; 
            }
            else if( sum < target)
            {
                i++; 
            }
        }
    }
    static int[] ts1(int arr[], int target)
    {
        Arrays.sort(arr); 
        int i = 0; 
        int n = arr.length; 
        int j = n - 1;
        // 1 2 5   t=4    
        //   ij

        while( i < j)
        {
            int sum = arr[i] + arr[j]; 
            if( sum == target)
            {
                // return new int[]{}
                return new int[]{arr[i], arr[j]};
            }
            else if( sum > target)
            {
                j--; 
            }
            else if( sum < target)
            {
                i++; 
            }
        }

        return new int[]{-1,-1}; 

    }


    public static void main(String[] args) {
        int p[] = {10009,2,12,45,112,123};
        Integer p1[] = new Integer[p.length]; 

        int[][] k = {{2,3}, {1,4}};
        for(int i = 0; i < p.length; i++)
        {
            p1[i] = p[i]; 
        }
        Five b = new Five(); 
        Seven b1 = new Seven(); 
        Arrays.sort(k, b1);
        System.out.println(Arrays.toString(k));
        for( int[] t: k)
        {
            System.out.println(Arrays.toString(t));
        }
        // Collections.sort(arr,b[]);


    }
}

class Five implements Comparator<Integer> {
    public int compare(Integer a, Integer b)
    {
        return b - a; 
    }
    
}
class Seven implements Comparator<int[]> {
    public int compare(int[] a, int[] b)
    {
        return a[0] - b[0]; 
    }
    
}


*/