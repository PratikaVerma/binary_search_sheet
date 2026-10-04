// Q8: Kth Missing Positive Number (LeetCode 1539)
// Time: O(log n), Space: O(1)

 public class Q8 {
    static int findKthPositive(int[] arr, int k) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int missing = arr[mid] - (mid + 1);
            if (missing < k)
                left = mid + 1;
            else
                right = mid - 1;
        }
         return left + k;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
        System.out.println(findKthPositive(arr, k));
    }
}
