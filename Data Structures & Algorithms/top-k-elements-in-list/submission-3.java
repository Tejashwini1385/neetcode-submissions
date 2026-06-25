class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer>map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num, map.getOrDefault(num,0) + 1);
        }
        List<Integer> freq= new ArrayList<>(map.keySet());
        freq.sort((a,b)->Integer.compare(map.get(b),map.get(a)));
        int[] answer=new int[k];
        for(int i=0;i<k;i++)
        {
            answer[i]=freq.get(i);
        }
        return answer;
        
    }
}
