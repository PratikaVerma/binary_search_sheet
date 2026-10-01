 // Q2a: Lower Bound (GFG)
// https://www.geeksforgeeks.org/implement-lower-bound
// Time: O(log n), Space: O(1)

public class Q2a {
    static class Solution {
        int lowerBound(int[] arr, int target) {
            int low = 0;
            int high = arr.length - 1;
            int result = arr.length;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (arr[mid] >= target) {
                    result = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1, 2, 2, 3, 5, 5, 5, 8};
        System.out.println(s.lowerBound(arr, 5)); 
        System.out.println(s.lowerBound(arr, 9)); 
    }
}