public class Heotes5{
    
    public static int maxSumSubarray(int[] arr, int k) {
        int n = arr.length;
        if (n < k) {
            throw new IllegalArgumentException("Array is smaller than window size");
        }

        // 1. Calculate the sum of the first window
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        
        int maxSum = windowSum;
        
        // 2. Slide the window from index k to the end of the array
        for (int i = k; i < n; i++) {
            // Add the next element, subtract the first element of the previous window
            windowSum = windowSum + arr[i] - arr[i - k];
            
            // Update the maximum sum found so far
            maxSum = Math.max(maxSum, windowSum);
        }
        
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println("Max sum of subarray of size " + k + ": " + maxSumSubarray(arr, k));
        // Output: Max sum of subarray of size 3: 9
    }
}