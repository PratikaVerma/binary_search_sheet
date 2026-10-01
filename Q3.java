// Q3: Guess Number Higher or Lower (LeetCode 374)
// Time: O(log n), Space: O(1)

public class Q3 {
    static int pick = 5;
    static int guess(int num) {
        if (num > pick) return -1;
        if (num < pick) return 1;
        return 0;
    }

    static int guessNumber(int n) {
        int low = 1;
        int high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int result = guess(mid);
            if (result == 0) {
                return mid;
            } else if (result < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(guessNumber(10));
    }
} 