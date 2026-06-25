class Solution {
    public int longestConsecutive(int[] nums) {
        //using HashSet
        //Check the prev number that exist in set
        Set<Integer> set=new HashSet<>();
        for(int num:nums)
        {
            set.add(num);
        }
        int longest=0;
        for(int num:nums)
        {
            if(!set.contains(num-1))
            {
                int curNum=num;
                int curLen=1;
                while(set.contains(curNum+1))
                {
                  curNum++;
                  curLen++;
                }
                longest=Math.max(longest,curLen);
            }
            
        }
        return longest;
        
    }
}
