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
public class c1_1 {
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("Helloworld");
        //System.out.println(StringUnique("abc"));
        //System.out.println("abc".indexOf("b",2));
        //System.out.println(reversecstyle("abc"));
        
        //String input = "     ";
        //String output = replacetwo(input);
        //System.out.println(output);
        //System.out.println(replace(input));
        
        int[][] input = new int[][]{
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        printmatrix(input);
        rotate(input);
        
    }
    //1_1
    public static boolean StringUnique(String _input){
        for(int i = 0; i < _input.length(); i++){
            if(_input.indexOf(_input.toCharArray()[i], i+1) > -1){
                return false;
            }
        }
        return true;
    }
    
    public static boolean isUniqueChars2(String _input){
        boolean[] char_set = new boolean[256];
        for(int i = 0; i< _input.length(); i++){
            int val = _input.charAt(i);
            if (char_set[val]) return false;
            char_set[val] = true;
        }
        return true;
    }
    
    //1_2
    public static String reversecstyle(String _input){
        StringBuilder sentence = new StringBuilder();
        for(int i = _input.length();i>0;i--){
            sentence.append(_input.charAt(i-1));
        }
        
        return sentence.toString();
    }
    
    //1_3
    public static String removedup(String _input){
        char[] input = _input.toCharArray();
        
        return null;
    }
    
    //1_4
    public static String replace(String _input){
        return _input.replace(" ", "%20");
    }
    
    public static String replacetwo(String _input){
        char[] input = _input.toCharArray();
        int fix = 0;
        for(int i = 0;i < input.length; i++){
            if(input[i] == ' '){
                fix++;
            }        
        }
        char[] output = new char[input.length + fix * 2];
        //output = input.clone();

        for(int i = output.length - 1; i >= 0; i--){
            
            if(input[i - fix*2] == ' '){
                fix--;
                output[i] = '0';
                output[i-1] = '2';
                output[i-2] = '%';
                i -= 2;
            }
            else{
                output[i] = input[i - fix*2];
            }
        }
        return output.toString();
    }
    
    //1_6
    public static void rotate(int[][] _input){
        int n = _input.length;
        for(int i = 0; i <= (n-1)/2; i++){
            for(int j = 0; j <= (n-1)/2; j++){
                int top = _input[i][j];
                
                _input[i][j] = _input[n-j-1][i];
                
                _input[n-j-1][i] = _input[n-i-1][n-j-1];
                
                _input[n-i-1][n-j-1] = _input[j][n-i-1];
                
                _input[j][n-i-1] = top;
                
                System.out.println(i+" "+j +" "+n + " " + (n-1)/2);
                printmatrix(_input);
                
            }
        }
    }
    
    public static void printmatrix(int[][] _input){
        for(int[] i : _input){
            for(int j : i){
                System.out.print(j + "\t");
            }
            System.out.println();
        }
        System.out.println("_____________________");
    }
}
