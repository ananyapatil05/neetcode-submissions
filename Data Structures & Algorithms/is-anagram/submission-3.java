class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character,Integer> hmCh1 = new HashMap<>();
        Map<Character,Integer> hmCh2 = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch1 = s.charAt(i); 
            char ch2 = t.charAt(i);
            hmCh1.put(ch1,hmCh1.getOrDefault(ch1,0)+1);
            hmCh2.put(ch2,hmCh2.getOrDefault(ch2,0)+1);  
        }

        for(Character c : hmCh1.keySet()){
            if(!hmCh1.get(c).equals(hmCh2.get(c))){
                return false;
            }
            
        }

        return true;
    }
}