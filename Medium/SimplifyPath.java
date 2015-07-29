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