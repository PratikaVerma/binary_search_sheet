// Q9: Count Negative Numbers in a Sorted Matrix (LeetCode 1351)
// Time: O(m log n), Space: O(1)
// m = rows, n = columns

public class Q9 {
    static int countNegatives(int[][] grid) {
        int count = 0;
        for (int[] row : grid) {
            int low = 0;
            int high = row.length - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (row[mid] < 0) {
                    high = mid - 1;    
                } else {
                    low = mid + 1;     
                }
            }
            count += row.length - low;
        }
         return count;
    }

    public static void main(String[] args) {
        int[][] grid1 = {
            {4, 3, 2, -1},
            {3, 2, 1, -1},
            {1, 1, -1, -2},
            {-1, -1, -2, -3}
        };
        System.out.println(countNegatives(grid1)); 
    }
}