// Q13: Search a 2D Matrix II (LeetCode 240)
// Binary Search approach (har row mein)
// Time: O(m log n), Space: O(1)   (m = rows, n = columns)

public class Q13 {
    static boolean searchMatrix(int[][] matrix, int target) {

        // har row ke liye alag binary search
        for (int[] row : matrix) {
            int low = 0, high = row.length - 1;
            
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (row[mid] == target) {
                    return true;           // mil gaya
                } else if (row[mid] < target) {
                    low = mid + 1;         // mid chhota hai, right mein jao
                } else {
                    high = mid - 1;        // mid bada hai, left mein jao
                }
            }
        }
         return false;                      // kisi row mein nahi mila
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };

        System.out.println(searchMatrix(matrix, 5));   
        System.out.println(searchMatrix(matrix, 20));
    }
}
