 // Q5: Sqrt(x) (LeetCode 69)
// Time: O(log x), Space: O(1)

public class Q5 {
    static int mySqrt(int x) {
        if (x < 2)
            return x;
        int left = 1, right = x / 2;
        int ans = 1;                   

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid <= x / mid) {
                ans = mid;             
                left = mid + 1;    
            } else {
                right = mid - 1;  
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(4));    
        System.out.println(mySqrt(8));    
        System.out.println(mySqrt(16));   
        System.out.println(mySqrt(1));    
    }
}