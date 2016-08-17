/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C1arrayandstring;

/**
 *
 * @author jochen
 */
public class c4_1 {
    public static void main(String[] args){
    
       
        
    }
    
    
    //4_1
    public static boolean balanceTree(TreeNode root){
        return (maxDepth(root) - minDepth(root) <= 1);
    }
    
    public static int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
    
    public static int minDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}

class TreeNode{
    TreeNode left = null;
    TreeNode right = null;
}