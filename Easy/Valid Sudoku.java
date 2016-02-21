/*
Valid Sudoku

Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.

The Sudoku board could be partially filled, where empty cells are filled with the character '.'.


A partially filled sudoku which is valid.
*/


public class Solution {
  public boolean isValidSudoku(char[][] board) {
    HashSet<String> set = new HashSet<String>();
    
    for(int i=0;i<board.length;i++){
      for(int j=0;j<board[0].length;j++){
        if(board[i][j] == '.')
          continue;
        String rowKey = 'r' + Integer.toString(i) + board[i][j];
        String columnKey = 'c' + Integer.toString(j) + board[i][j];
        String cellKey = Integer.toString(i/3) + Integer.toString(j/3) + board[i][j];
        
        if(set.contains(columnKey) || set.contains(rowKey) || set.contains(cellKey))
          return false;
          
        set.add(rowKey);
        set.add(columnKey);
        set.add(cellKey);
      }
    }
    
    return true;
  }
}