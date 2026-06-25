class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);

        }
        List<List<Integer>> bucket=new ArrayList<>();
        for(int i=0;i<=nums.length;i++)
        {
               bucket.add(new ArrayList<>());
        }
        for(int num:map.keySet())
        {
            int count=map.get(num);
            bucket.get(count).add(num);
        }
        int[] answer=new int[k];
        int index=0;
        for(int i=nums.length;i>=1;i--)
        {
            for(int num:bucket.get(i))
            {
                answer[index]=num;
                index++;
            }
            if(index==k)
            {
                return answer;
            }
        }


    return answer;
    }
}
