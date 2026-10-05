
// Q10: Rotation (GFG)
// https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array
//Given an increasing sorted rotated array arr[] of distinct integers. The array is right-rotated k times. Find the value of k.
 
public class Q10 {
    static int findKRotation(int[] arr) {
        int low = 0, high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > arr[high]) {
                low = mid + 1;      
            } else {
                high = mid;         
            }
        }
        return low;                
    }

    public static void main(String[] args) {
        System.out.println(findKRotation(new int[]{5, 1, 2, 3, 4})); 
        System.out.println(findKRotation(new int[]{6, 7, 8, 9, 2}));
    }
} 