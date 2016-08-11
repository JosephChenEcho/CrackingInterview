/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C1arrayandstring;

import java.util.*;

/**
 *
 * @author Joseph
 */
public class c2_1 {
    public static void main(String[] args){
        Node input = new Node(1);
        Node input1 = new Node(2);
        Node input2 = new Node(5);
        Node input3 = new Node(4);
        Node input4 = new Node(3);
        Node input5 = new Node(7);
        Node input6 = new Node(6);
        Node input7 = new Node(9);
        input.next = input1;
        input1.next = input2;
        input2.next = input3;
        //input3.next = input4;
        input4.next = input5;
        input5.next = input6;
        input6.next = input7;
        //deleteDups(input);
        //printNode(removeMiddleNode(input));
        
        printNode(input);
        printNode(input4);
        printNode(addNode(input,input4));
        
    } 
    
    public static void testNode(){
        Node test = new Node(3);
        test.next = null;
    }
    
    //c2_1
    public static void deleteDups(Node n){
        //Hashtable table = new Hashtable();
        HashSet table = new HashSet();
        Node previous = null;
        previous = n;
        while( n != null){
            if (table.contains(n.data)){ 
                previous.next = n.next;
            }else{
                table.add(n.data);
                previous = n;
                //n = n.next;
            }
            //printNode(previous);
            n = n.next;
            System.out.println("After");
            //printNode(previous);
            
            
        }
    }
    
    //2_2
    public static Node nthToLast(Node head, int n){
        if(head == null || n <1){
            return null;
        }
        Node p1 = head;
        Node p2 = head;
        for (int j = 0; j < n - 1; ++j){
            if(p2 == null){
                return null;
            }
            p2 = p2.next;
        }
        while (p2.next != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
    
    //2_3
    
    public static Node removeMiddleNode(Node _input){
        if(_input == null) return _input;
        Node p1 = _input;
        Node p2 = _input;
        int i = 0;
        while(p1.next != null){
            p1 = p1.next;
            i++;
        }
        int j = (i+1)/2;
        while(j > 1){
            p2 = p2.next;
            j--;
        }
        p2.next = p2.next.next;
        return p2;
    }
    
    public static boolean deleteMiddle(Node n){
        Node next = n.next;
        n.data = next.data;
        n.next = next.next;
        return true;
    }
    
    //2_4
    public static Node addNode(Node a, Node b){
        
        Node returnnode = new Node(0);
        returnnode.next = new Node(0);
        Node current = returnnode.next;
        boolean nextplus = false;
        
        while(a != null && b != null){
            int nodedata = a.data + b.data;
            if(nextplus) nodedata += 1;
            
            if(nodedata >= 10){
                nextplus = true;
                nodedata %= 10;
            }
            else{
                nextplus = false;
            }
            current.data = nodedata;
            current.next = new Node(0);
            current = current.next;    
            a = a.next;
            b = b.next;
        }
        if(nextplus){
            current.data = 1;
        }
        else{
            current = null;
        }
        
        return returnnode.next;
    }
    
    public static void printNode(Node n){
        Node current = n;// new Node(0);
        //current.next = n;
        //current = current.next;
        while( current != null){
            System.out.print(current.data+"\t");
            current = current.next;
        }
        System.out.println();
    }
}

class Node{
    Node next = null;
    int data;
    public Node(int d) { data = d;}
}