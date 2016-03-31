# 189 Rotate Array
My solution: 
Using 3 for loop to find the pattern


Good Solution:
If you use %, you will find the pattern:

public class Solution {
    public void rotate(int[] nums, int k) {
       Int[] answer = new int [nums.length];
       for(int i = 0; i < nums.length; i++){
           answer[(i+k) % nums.length] = nums[i];
       }
       for(int j = 0; j < nums.length; j++){
           nums[j] = answer[j];
       }
    }
}
