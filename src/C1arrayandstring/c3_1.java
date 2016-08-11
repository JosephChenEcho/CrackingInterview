/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C1arrayandstring;

import java.util.*;

/**
 *
 * @author jochen
 */
public class c3_1 {
    public static void main(String[] args){
        //Stack s = new Stack();
        SetOfStacks s = new SetOfStacks();
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        s.push(6);
        s.push(7);
        
        while(!s.isEmpty()){
            System.out.print(s.pop() + "\t");
        }             
    }
}

//3_3
class SetOfStacks{
    Stack[] stacks = new Stack[100];
    int stackmax = 5;
    int stackindex = 0;
    int i = 0;
    
    void push(int item){
        if(stacks[stackindex] == null){
            stacks[stackindex] = new Stack();
        }        
        stacks[stackindex].push(item);
        i++;
        stackindex = i/stackmax;
    }
    
    Object pop(){   
        Object retval = stacks[stackindex].pop();
        i--;
        stackindex = (i-1)/stackmax;
        return retval;
    }
    
    Object peek(){
        return stacks[stackindex].peek();
    }
    
    boolean isEmpty(){
        return stacks[0].isEmpty();
    }
}

/*
class Stack{
    Node top;
    int pop(){
        if(top != null){
            int item = top.data;
            top = top.next;
            return item;
        }
        return 0;
    }
    void push(int item){
        Node t = new Node(item);
        t.next = top;
        top = t;
    }    
}
*/

/*
class Queue{
    Node first, last;
    void enqueue(int item){
        if(!first){}
    }
}*/