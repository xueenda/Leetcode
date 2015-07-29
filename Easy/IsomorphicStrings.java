public class Solution {
    public boolean isIsomorphic(String s, String t) {
        return test(s,t) && test(t,s);
    }
    
    public boolean test(String s, String t){
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        for(int i=0; i<sArray.length;i++){
            if(map.containsKey(sArray[i]))
                if(tArray[i] != map.get(sArray[i]))
                    return false;
            map.put(sArray[i],tArray[i]);
        }
        return true;   
    }
}