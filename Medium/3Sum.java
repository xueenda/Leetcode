/*
3Sum

Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note:
Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c)
The solution set must not contain duplicate triplets.
  For example, given array S = {-1 0 1 2 -1 -4},

  A solution set is:
  (-1, 0, 1)
  (-1, -1, 2)
 */


public class Solution {

  public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
  
  ArrayList<ArrayList<Integer>> rst = new ArrayList<ArrayList<Integer>>();

  if(num == null || num.length < 3) {
    return rst;
  }

  Arrays.sort(num);

  for (int i = 0; i < num.length - 2; i++) {
    if (i != 0 && num[i] == num[i - 1]) {
      continue; // to skip duplicate numbers; e.g [0,0,0,0]
    }

    int left = i + 1;
    int right = num.length - 1;

    while (left < right) {
      int sum = num[left] + num[right] + num[i];

      if (sum == 0) {
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        tmp.add(num[i]);
        tmp.add(num[left]);
        tmp.add(num[right]);
        rst.add(tmp);
        left++;
        right--;

        while (left < right && num[left] == num[left - 1]) { // to skip duplicates
          left++;
        }

        while (left < right && num[right] == num[right + 1]) { // to skip duplicates
          right--;
        }
      } else if (sum < 0) {
        left++;
      } else {
        right--;
      }
    }
  }
  return rst;
  }
}


// javascript
/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function(nums) {
  var result = [];
  
  if(!nums || nums.length < 3)
    return result;
  
  nums.sort(function(a,b){return a - b});
  
  for(var i=0; i<nums.length-2; i++){
    if(i!=0 && nums[i] == nums[i-1])
      continue;
      
    var left = i + 1;
    var right = nums.length - 1;
    
    while(left < right){
      var sum = nums[i] + nums[left] + nums[right];
      if(sum == 0){
        var list = [];
        list.push(nums[i]);
        list.push(nums[left++]);
        list.push(nums[right--]);
        result.push(list);
        
        while(left<right && nums[left] == nums[left-1])
          left++;
          
        while(left<right && nums[right] == nums[right+1])
          right--;
      }else if(sum < 0){
        left++;
      }else{
        right--;
      }
    }
  }
  
  return result;
};

