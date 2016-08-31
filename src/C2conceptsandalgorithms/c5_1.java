/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C2conceptsandalgorithms;

/**
 *
 * @author jochen
 */
public class c5_1 {
    public static void main(String[] args){
        System.out.println(updateBits(1000000000, 10101, 2, 6));
    }
    
    public static int updateBits(int n, int m, int i, int j){
        int max = ~0;
        
        int left = max - ((1 << j) - 1);
        
        int right = ((1 << i) - 1);
        
        int mask = left | right;
        
        return (n & mask) | (m << i);
    }
}
