class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> val=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            
            if(val.containsKey(target-nums[i]))
            {
                return new int[] { val.get(target-nums[i]),i};
            }
            val.put(nums[i],i);
        }
        return new int[] {-1};
    }
}
