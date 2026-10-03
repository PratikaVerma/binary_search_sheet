// Q7: Search Insert Position (LeetCode 35)
// Time: O(log n), Space: O(1)

public class Q7 {
    static int searchInsert(int[] nums, int target) {
         int left = 0;                  
        int right = nums.length - 1;   

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;              // mil gaya
            } else if (nums[mid] < target) {
                left = mid + 1;          // mid chhota hai, right mein jao
            } else {
                right = mid - 1;         // mid bada hai, left mein jao
            }
        }
        return left;                     // na mile to insert hone ki jagah
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};

        System.out.println(searchInsert(nums, 5));   
    }
}
