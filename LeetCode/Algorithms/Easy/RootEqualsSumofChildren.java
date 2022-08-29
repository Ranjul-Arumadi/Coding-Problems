/*
  link: https://leetcode.com/problems/root-equals-sum-of-children/submissions/
  
  You are given the root of a binary tree that consists of exactly 3 nodes: the root, its left child, and its right child.

  Return true if the value of the root is equal to the sum of the values of its two children, or false otherwise.
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean checkTree(TreeNode root) {
        int p = root.val;
        int l = root.left.val;
        int r = root.right.val;
        int x = l+r;
        
        if(x==p){
            return true;
        }
        else{
            return false;
        }
    }
}
