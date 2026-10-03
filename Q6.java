// Q6: Valid Perfect Square (LeetCode 367)
// Time: O(log n), Space: O(1)

public class Q6 {
    static boolean isPerfectSquare(int num) {
        int left = 1, right = num;
         while (left <= right) {
            int mid = left + (right - left) / 2;
            // long isliye kyunki mid * mid bade numbers mein int se bada ho sakta hai
            long square = (long) mid * mid;

            if (square == num) {
                return true;           
            } else if (square < num) {
                left = mid + 1;        // mid chhota hai, right mein jao
            } else {
                right = mid - 1;       // mid bada hai, left mein jao
            }
        }

        return false;                  // koi poora number nahi mila
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));    
        System.out.println(isPerfectSquare(14)); 
        System.out.println(isPerfectSquare(1)); 
    }
}