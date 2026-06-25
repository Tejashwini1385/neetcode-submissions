class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded= new StringBuilder();
        for(String word:strs){
            encoded.append(word.length());
            encoded.append("#");
            encoded.append(word);
        }
        return encoded.toString();

    }

    public List<String> decode(String str) {
        List<String> result=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#')
            {
               j++;
            }
            int length= Integer.parseInt(str.substring(i,j));
            i=j+1;
            String word= str.substring(i,i+length);
            result.add(word);
            i=i+length;
        }
        return result;

    }
}
