# 228 Summary Ranges
My solution: 
Consider conditions including no number, only one number and regular numbers with ranges
Avoid array out of index exception ( do not use i+1)
Number have to have “”+number in order to be a string

public class Solution {
    public List<String> summaryRanges (int[] nums) {
        List<String> answer = new ArrayList<String>();
        int count = 1;

        if(nums.length != 0){ 
            int start = nums [0];
            for (int i = 1; i < nums.length; i++ ){
                if (nums[i] == nums[i - 1] + 1){
                   count ++;
                }else{
                     if (count == 1){
                        answer.add ("" + nums[i - 1]);
                        start = nums[i];
                    }else{
                        answer.add( start + "->" + nums[i - 1]);
                        count = 1;
                        start = nums[i];
                    }
                }
            }
            
            if (count == 1){
                answer.add(""+ start);
            }else{
                answer.add(start + "->" + nums[nums.length - 1]);
            }
        }
        return answer;
    }
}
