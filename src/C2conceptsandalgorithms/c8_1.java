/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C2conceptsandalgorithms;
import java.lang.Math;

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
        
        //System.out.println(getPath(0,0));
        int[] i = new int[4];
        placeQueen(i,0);
        
    }
    
    
    //8_1
    public static int fibonacci(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        
        return fibonacci(n-1) + fibonacci(n-2);
    }
    
    //8_2
    public static int getPath(int x1, int y1){
        int x2 = 8, y2 = 8; //set destination
        int returnval = 0;
        if (x1 + 1 == x2 && y1 == y2){ return 1;}
        if (y1 + 1 == y2 && x1 == x2){ return 1;}
        if (x1 + 1 <= x2) {
            returnval += getPath(x1 + 1,y1);
        }
        if (y1 + 1 <= y2) {
            returnval += getPath(x1,y1 + 1);
        }
            
        return returnval;
        
    }
    
    
    //8_8
    public static void placeQueen(int[] _board, int row){
        int l = _board.length ;
        if ( row == l){
            printBoard(_board);
            return;
        }
        for (int i = 0; i < l; i++){
            _board[row] = i;
            if(check(_board,row)){
                placeQueen(_board, row+1);
            }
        }
    }
    
    public static boolean check(int[] _board, int row){
        for(int i = 0; i < row; i++){
            int diff = Math.abs(_board[i] - _board[row]);
            if (diff == 0 || diff == row - i) return false;
        }
        return true;
    }

    
    public static void printBoard(int[] _board){
        for(int i : _board){
            int[] row = new int[_board.length];
            row[i] = 1;
            for (int j : row){
                System.out.print(j + "\t");
            }
            System.out.println();
        }
        System.out.println("------------------");
    }

}


