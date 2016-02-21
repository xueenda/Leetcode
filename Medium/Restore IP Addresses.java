/*
Restore IP Addresses

Given a string containing only digits, restore it by returning all possible valid IP address combinations.

For example:
Given "25525511135",

return ["255.255.11.135", "255.255.111.35"]. (Order does not matter)
*/

/*
注意 isvalid 的应用，来验证是否为有效的substring
*/


public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<String>();
         if(s.length() <4 || s.length() > 12)
            return result;
            
        ArrayList<String> list = new ArrayList<String>();
        
        helper(result,list,s,0);
        return result;
    }
    
    private void helper(List<String> result, ArrayList<String> list, String s, int start){
        if(list.size() == 4){
            if(start != s.length())
                return;
            String[] ip = new String[4];
            ip = list.toArray(ip);
            result.add(String.join(".", ip));
            return;
        }
        
        for(int i=start;i<s.length() && i <= start+3;i++){
            String tmp = s.substring(start, i+1);
            if(isvalid(tmp)){
                list.add(tmp);
                helper(result, list, s, i+1);
                list.remove(list.size()-1);
            }
        }
    }
    
    private boolean isvalid(String s){
        if(s.charAt(0) == '0')
            return s.equals("0"); // to eliminate cases like "00", "10"
        int digit = Integer.valueOf(s);
        return digit >= 0 && digit <= 255;
    }
}