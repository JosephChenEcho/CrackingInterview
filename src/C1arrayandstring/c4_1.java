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
        
        //test case for 4_1
        /*
        TreeNode ta = new TreeNode(1);
        TreeNode tb = new TreeNode(2);
        TreeNode tc = new TreeNode(3);
        TreeNode td = new TreeNode(4);
        TreeNode te = new TreeNode(5);
        TreeNode tf = new TreeNode(6);
        TreeNode tg = new TreeNode(7);
        
        ta.left = tb;
        ta.right = tc;
        tb.left = td;
        tb.right = te;
        tc.left = tf;
        tc.right = tg;
        
        System.out.println(balanceTree(ta));
        */
        
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
    
    //4_3
    public static TreeNode addToTree(int arr[], int start, int end){
        if(end < start){
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode n = new TreeNode(arr[mid]);
        n.left = addToTree(arr, start, mid-1);
        n.right = addToTree(arr, mid + 1, end);
        return n;
    }
    
    public static TreeNode createMinBT(int array[]){
        return addToTree(array, 0, array.length - 1);
    }
    
}

class TreeNode{
    TreeNode left = null;
    TreeNode right = null;
    Object value;
    TreeNode(Object _value){
        this.value = _value;
    }
}
