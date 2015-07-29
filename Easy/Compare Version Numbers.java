/*
Compare Version Numbers Total Accepted: 27878 Total Submissions: 182728 My Submissions Question Solution 
Compare two version numbers version1 and version2.
If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.

You may assume that the version strings are non-empty and contain only digits and the . character.
The . character does not represent a decimal point and is used to separate number sequences.
For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.

Here is an example of version numbers ordering:

0.1 < 1.1 < 1.2 < 13.37
*/

public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int i=0;
        for(i=0; i< Math.min(v1.length,v2.length);i++){
            int result = compare(v1[i], v2[i]);
            if(result != 0)
                return result;
        }
        
        
        if(v1.length > v2.length){
            return compare(v1[i],"0");
        }
            
        else if(v1.length < v2.length)
            return compare("0",v2[i]);
        else
            return 0;
    }
    private int compare(String s1,String s2){
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        
        if(n1 > n2)
            return 1;
        else if(n1 < n2)
            return -1;
        else
            return 0;
    }
}