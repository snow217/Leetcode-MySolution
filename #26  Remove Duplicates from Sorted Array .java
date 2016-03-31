#26  Remove Duplicates from Sorted Array

My Solution:
Using two pointer: One to remember size/index that need to add value.(Similar to #27)
public class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        if(nums.length!=0){
            int temp = nums[0];
            for (int i = 0; i < nums.length; i++){
                if(nums[i] != temp){
                    nums[count++] = nums[i];
                    temp = nums[i];
                }
            }
        }
        return count;
    }
}
