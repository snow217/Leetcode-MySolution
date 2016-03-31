//#217. Contains Duplicate
//using hash map/hashset to solve this problem

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                return true;
            }else{
                map.put(nums[i], i);
            }
        }
        return false;
    }
}

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0){
            return false;
        }
        Set<Integer> set = new HashSet<Integer>();
        for (int n : nums){
            if (!set.add(n)){
                return true;
            }
        }
        return false;
    }
}