/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cracking;
import java.util.*;
/**
 *
 * @author jochen
 */
public class Cracking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedListNode input = new LinkedListNode("a");
        LinkedListNode input1 = new LinkedListNode("b");
        LinkedListNode input2 = new LinkedListNode("c");
        LinkedListNode input3 = new LinkedListNode("d");
        LinkedListNode input4 = new LinkedListNode("e");
        LinkedListNode input5 = new LinkedListNode("f");
        
        input.next = input1;
        input1.next = input2;
        input2.next = input3;
        input3.next = input4;
        input4.next = input5;
        
        String[] skip = {"c","d","a"};
        
        printnode(updateRoute(input,skip));
        
    }
    static LinkedListNode updateRoute(LinkedListNode initialRoute, String[] citiesToSkip) {
        if(initialRoute == null){
            return null;
        }
        LinkedListNode ret = new LinkedListNode("return");
        ret.next = initialRoute;
        LinkedListNode current = ret;
        while (current.next != null){
            //Use hash set later
            for (int i = 0; i < citiesToSkip.length; i++){
                if(current.next.val == citiesToSkip[i]){
                    current.next = current.next.next;
                    i = 0;
                }
            }
            current = current.next;
            
        }
        
        return ret.next;

    }
    
    static void printnode(LinkedListNode p){
        while(p != null){
            System.out.println(p.val);
            p = p.next;
        }
    }
    
}
      class LinkedListNode{
        String val;
        LinkedListNode next;
    
        LinkedListNode(String node_value) {
            val = node_value;
            next = null;
        }
    };
    
