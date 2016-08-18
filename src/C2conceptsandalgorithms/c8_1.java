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
public class c8_1 {
    public static void main(String[] args){
        
        //8_1
        /*
        int[] a = {1,2,3,4,5,6,7,8,9};
        
        for(int i : a){
            System.out.println(fibonacci(i));
        }
        */
        
        int[][] i = new int[4][4];
        
        
    }
    
    
    //8_1
    public static int fibonacci(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        
        return fibonacci(n-1) + fibonacci(n-2);
    }
    
    //8_2

}
