public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null || s.length() == 0)
            return 0;
            
        HashSet<Character> set = new HashSet<Character>();
        int max = 0;
        int j = 0;
        
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                max = Math.max(max, set.size());
                for(;j<i&&s.charAt(j)!=s.charAt(i);j++){
                    set.remove(s.charAt(j));
                }
                j++;
            }else{
                set.add(s.charAt(i));
            }
            
        }
        return Math.max(max, set.size());
    }
}