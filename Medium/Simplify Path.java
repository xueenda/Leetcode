/*
Simplify Path

Given an absolute path for a file (Unix-style), simplify it.

For example,
  path = "/home/", => "/home"
  path = "/a/./b/../../c/", => "/c"

Corner Cases:
  Did you consider the case where path = "/../"?
  In this case, you should return "/".
  Another corner case is the path might contain multiple slashes '/' together, such as "/home//foo/".
  In this case, you should ignore redundant slashes and return "/home/foo".

*/


public class Solution {
  public String simplifyPath(String path) {
    if(path.length()==0)
      return "";
      
    Stack<String> stack = new Stack<String>();
    String[] folders = path.split("/");
    
    for(int i=0;i<folders.length;i++){
      if(folders[i].equals("..")){
        if(!stack.isEmpty())
          stack.pop();
      }
      else if(folders[i].equals(".")){
        continue;
      }
      else{
        if(!folders[i].equals(""))
          stack.push(folders[i]);
      }
    }
    
    String p = "";
    while(!stack.isEmpty()){
      p = "/"+stack.pop()+p;
    }
    
    return p == ""?"/":p;
  }
}