## Integer

Bit 32 位

## Quick Sort

1.Pick an element, called a pivot, from the array.

2.Reorder the array so that all elements with values less than the pivot come before the pivot, while all elements with values greater than the pivot come after it (equal values can go either way). After this partitioning, the pivot is in its final position. This is called the partition operation.

3.Recursively apply the above steps to the sub-array of elements with smaller values and separately to the sub-array of elements with greater values.

## StringBuilder
// reverse sting
new StringBuilder(hi).reverse().toString()

// remove chat
sb.deleteCharAt(index);

// to string
sb.toString();


## String to Char Array
char[] arr = string.toCharArray();

// trim
string.strim();
string.substring(int start, int length);

// Split
string.split(",") May contain "" element

// Equals
string.equals("abc") don't use "=="

// String join
String.join(".", ip)

// String to int
int digit = Integer.valueOf(s);

// String replace and to lower case
s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

## Search in log(n)

Binary search:
int mid = start + (end-start)/2;


## HashMap

map.contains()
map.containsKey()
map.put(key, value)
map.get(key)
map.values()


## Stack

Stack<String> stack = new Stack<String>();
stack.isEmpty()


# Array sort
Arrays.sort(nums);

# List to Array

String[] strs = list.toArray(new String[list.size()]);

# Queue 
Queue<TreeNode> queue = new LinkedList<TreeNode>();
// add to queue
queue.offer(value);

// poll from queue
queue.poll();