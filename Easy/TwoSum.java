public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] a = new int[2];
        
        for(int i =0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                int j = map.get(target-nums[i]);
                if(i!=j){
                    a[0] = i+1;
                    a[1] = j+1;
                    return a;
                }
            }
        }
        
        return a;
    }
}