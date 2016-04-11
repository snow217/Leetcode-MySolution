//35. Search Insert Position
public class Solution {
    public int searchInsert(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        int mid = 0;
       
        while (lo <= hi){
            mid = (hi+lo)/2;
            if(target < nums[mid]){
                hi = mid - 1;
            }else if(target > nums[mid]){
                lo = mid + 1;
            }else{
                return mid;
            }
        }
        return lo;
    }
}