class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> val=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            int comp=target-num;
            if(val.containsKey(comp))
            {
                return new int[] { val.get(comp),i};
            }
            val.put(num,i);
        }
        return new int[] {};
    }
}
