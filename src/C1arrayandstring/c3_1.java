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
        
        /*SetOfStacks s = new SetOfStacks();
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        s.push(6);
        s.push(7);
        s.push(9);
        s.push(8);
        
        while(!s.isEmpty()){
            System.out.print(s.pop() + "\t");
        }         
        
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        s.push(6);
        s.push(7);
        s.push(9);
        s.push(8);
        
        s.popAt(2);
        
        System.out.println();
        
        while(!s.isEmpty()){
            System.out.print(s.pop() + "\t");
        }  
        */
        
        //3_4 
        Stack sa = new Stack();
        Stack sb = new Stack();
        Stack sc = new Stack();
        
        sa.push(5);
        sa.push(4);
        sa.push(3);
        sa.push(2);
        sa.push(1);
        move(sa,sc,sb);
        
    }
    
    //3_4
    public static void move(Stack from, Stack to, Stack temp){
        System.out.println("From:");
        printStack(from);
        System.out.println("To:");
        printStack(to);
        System.out.println("temp:");
        printStack(temp);
        temp.push(from.pop());
        move(from,temp,to);
    }
    
    public static void printStack(Stack _stack){
        Object[] pstack = _stack.toArray();
        for(Object o : pstack){
            System.out.print(o + "\t");
        }
        System.out.println();        
    }
}

//3_3
class SetOfStacks{
    Stack[] stacks = new Stack[100];
    int stackmax = 2;
    int stackindex = 0;
    int i = 0;
    
    void push(int item){
        i++;
        stackindex = (i-1)/stackmax;
        if(stacks[stackindex] == null){
            stacks[stackindex] = new Stack();
        }        
        stacks[stackindex].push(item);        
    }
    
    Object pop(){   

        Object retval = stacks[stackindex].pop();
        i--;
        stackindex = (i-1)/stackmax;
        return retval;
    }
    
    Object popAt(int index){
        Object retval = stacks[index].pop();
        i--;
        stackindex = (i-1)/stackmax;
        while(stacks[++index] != null && !stacks[index].isEmpty()){
            Stack temp = new Stack();
            while(!stacks[index].isEmpty()){
                temp.push(stacks[index].pop());
            }
            stacks[index-1].push(temp.pop());
            while(!temp.isEmpty()){
                stacks[index].push(temp.pop());
            }
        }               
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