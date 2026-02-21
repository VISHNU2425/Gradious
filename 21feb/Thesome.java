import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;

public class Thesome{
    static List<List<Integer>> tHs1(int arr[])
    {
        int target = 0; 
        Arrays.sort(arr);
        List<List<Integer>> ans = 
        new List<>(); 

        for(int a = 0; a < arr.length; a++)
        {
            if( a != 0 && arr[a] == arr[a - 1])
            {
                continue; 
            }
            int b = a + 1; 
            int c = arr.length - 1; 
            while( b < c)
            {
                int sum = arr[a] + arr[b] + arr[c]; 
                if( sum == target) 
                {
                    List<Integer> t = new List<>();
                    t.add(arr[a]);
                    t.add(arr[b]);
                    t.add(arr[c]);
                    ans.add(t);    
                    b++;
                    c--; 
                    while( arr[b] == arr[b - 1]) {
                        b++; 
                    }
                    while( arr[c] == arr[c + 1]){
                        c--; 
                    }  
                }
                else if( \\sum < target )
                {
                    b++; 
        
                }
                else if( sum > target) 
                {
                    c--; 
                }
            }


        }
        return ans; 


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

