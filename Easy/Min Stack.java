/*
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.

分析：
建立两个stack
*/


class MinStack {
  private Stack<Integer> stack = new Stack<Integer>(); 
  private Stack<Integer> minStack = new Stack<Integer>(); 
  
  public void push(int x) {
    if(minStack.empty() || x <= minStack.peek())
      minStack.push(x);
    stack.push(x);  
  }

  public void pop() {
    if(!minStack.empty() && stack.peek().equals(minStack.peek()))
      minStack.pop();
    stack.pop();
  }

  public int top() {
    return stack.empty() ? 0 : stack.peek();
  }

  public int getMin() {
    return minStack.empty() ? 0 : minStack.peek();
  }
}