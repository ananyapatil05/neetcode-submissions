class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] allChar = new int[26];

        for(int i=0;i<s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            allChar[ch1 - 'a']++;
            allChar[ch2 - 'a']--;

        }

        for(int x : allChar){
            if(x != 0){
                return false;
            }
        }
        return true;


    }
}
