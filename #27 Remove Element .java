#27 Remove Element

Good Solution:
Using two pointer: One to remember size/index that need to add value
public class Solution {
    public int removeElement(int[] nums, int val) {
        //insert an pointer
        int size = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[size++] = nums[i];
            }
        }
        return size;
    }
}
