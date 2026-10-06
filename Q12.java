 // Q12: Search a 2D Matrix (LeetCode 74)
// Time: O(log(m*n)), Space: O(1)
// m = rows ,n= column;

public class Q12 {
    static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int low = 0;
        int high = rows * cols - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int row = mid / cols;
            int col = mid % cols;

            if (matrix[row][col] == target) {
                return true;
            }
            else if (matrix[row][col] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };

        System.out.println(searchMatrix(matrix, 3));   
        System.out.println(searchMatrix(matrix, 13));  
    }
}