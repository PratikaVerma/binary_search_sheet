  // Q1: Binary Search (LeetCode 704)
// Time: O(log n), Space: O(1)

class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target)
                return mid;

            if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }
}

class Q1 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        System.out.println(s.search(nums, 9)); // 4
    }
}