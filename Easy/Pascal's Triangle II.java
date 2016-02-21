/*
Pascal's Triangle II
Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
Return [1,3,3,1].

Note:
Could you optimize your algorithm to use only O(k) extra space?
*/


public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList();
        rowIndex = rowIndex+1;
        
        if(rowIndex > 0){
            for(int i=1; i <= rowIndex; i++){
                List<Integer> row = new ArrayList();
                for(int j = 1; j<=i; j++){
                    if(j == 1 || j == i)
                        row.add(1);
                    else{
                        int number = list.get(j-2) + list.get(j-1);
                        row.add(number);
                    }
                }
                list = row;
            }
        }
            
        return list;
    }
}