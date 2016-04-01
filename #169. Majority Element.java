//#169. Majority Element
//using hashmap to solve this problem
public class Solution {
    public int majorityElement(int[] nums) {
        Map <Integer,Integer> map = new HashMap<Integer,Integer>();
        int size = nums.length/2;
        int answer = 0;
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i]) + 1);
            }else{
                map.put(nums[i],1);
            }
            if(map.get(nums[i]) > size){
                answer = nums[i];
            }
        }
        return answer;
    }
}