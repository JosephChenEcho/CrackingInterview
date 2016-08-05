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
        System.out.println(reversecstyle("abc"));
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
    
    //1_2
    public static String reversecstyle(String _input){
        StringBuilder sentence = new StringBuilder();
        for(int i = _input.length();i>0;i--){
            sentence.append(_input.charAt(i-1));
        }
        
        return sentence.toString();
    }
}
