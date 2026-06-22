class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<String, List<String>> grps=new HashMap<>();
         for(String word:strs)
         {
            int[] freq=new int[26];
            for(char ch:word.toCharArray()){
                freq[ch-'a']++;
            }

            StringBuilder keyBuilder=new StringBuilder();
            for(int key:freq)
            {
                keyBuilder.append('#');
                keyBuilder.append(key);
            }
             String key=keyBuilder.toString();
            if(!grps.containsKey(key)){
            grps.put(key,new ArrayList<>());
            }
            grps.get(key).add(word);
            

         }
         return new ArrayList<>(grps.values());

    }
}
