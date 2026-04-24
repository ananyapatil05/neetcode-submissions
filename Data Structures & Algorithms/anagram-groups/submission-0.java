class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> mp = new HashMap<>();

        for(int i=0;i<strs.length;i++){
           String s = strs[i];
            int[] count = new int[26];
           for(int j=0;j<s.length();j++){
                char ch = s.charAt(j);
                count[ch-'a']++;
           } 

           String key = Arrays.toString(count);

           if(mp.containsKey(key)){
                mp.get(key).add(s);
                
           }else{
                List<String> li = new ArrayList<>();
                li.add(s);
                mp.put(key,li);
           }
        }

        List<List<String>> result = new ArrayList<>();
        for(List<String> l : mp.values()){
            result.add(l);
        }

        return result ;      
        
    }
}
