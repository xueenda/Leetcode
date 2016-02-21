# pre order (root,left,right)
//  recursive
preorder(node)
  if node == null then return
  visit(node)
  preorder(node.left) 
  preorder(node.right)

iterativePreorder(node)
  parentStack = empty stack
  while (not parentStack.isEmpty() or node ≠ null)
  if (node ≠ null) 
    visit(node)
    if (node.right ≠ null) parentStack.push(node.right) 
    node = node.left   
  else   
    node = parentStack.pop()


# In order (left, root, right)
//  recursive
inorder(node)
  if node == null then return
  inorder(node.left)
  visit(node)
  inorder(node.right)

iterativeInorder(node)
  parentStack = empty stack
  while (not parentStack.isEmpty() or node ≠ null)
  if (node ≠ null)
    parentStack.push(node)
    node = node.left
  else
    node = parentStack.pop()
    visit(node)
    node = node.right

# Post order (left, right, root)
//  recursive
postorder(node)
  if node == null then return
  postorder(node.left)
  postorder(node.right)
  visit(node)


iterativePostorder(node)
  parentStack = empty stack  
  lastnodevisited = null 
  while (not parentStack.isEmpty() or node ≠ null)
  if (node ≠ null)
    parentStack.push(node)
    node = node.left
  else
    peeknode = parentStack.peek()
    if (peeknode.right ≠ null and lastnodevisited ≠ peeknode.right) 
    /* if right child exists AND traversing node from left child, move right */
    node = peeknode.right
    else
    visit(peeknode)
    lastnodevisited = parentStack.pop() 
    node = null