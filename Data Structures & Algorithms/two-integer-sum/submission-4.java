class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> val=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int comp=target-nums[i];
            if(val.containsKey(comp))
            {
                return new int[] { val.get(comp),i};
            }
            val.put(nums[i],i);
        }
        return new int[] {};
    }
}
