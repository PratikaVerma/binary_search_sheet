// Q4: First Bad Version (LeetCode 278)
// Time: O(log n), Space: O(1)

public class Q4 {
    static int bad = 4;
    static boolean isBadVersion(int version) {
        return version >= bad;
    }
    static int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (isBadVersion(mid)) {
                high = mid;        
            } else {
                low = mid + 1;
            }
        }
        return low; 
    }              
    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
        bad = 2;
        System.out.println(firstBadVersion(1));
         bad = 6;
        System.out.println(firstBadVersion(10));
    }
}