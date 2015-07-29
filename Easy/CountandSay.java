public class Solution {
    public String countAndSay(int n) {
        if(n<=0)
            return "";
        String cur = "1";
        int start = 1;
        while(start<n){
            StringBuilder res = new StringBuilder();
            int count = 1;
            for(int i=0; i<cur.length(); i++){
                if(i+1 < cur.length() && cur.charAt(i) == cur.charAt(i+1))
                    count++;
                else{
                    res.append(count);
                    res.append(cur.charAt(i));
                    count = 1;
                }
            }
            cur = res.toString();
            start++;
        }
        
        return cur;
    }
}