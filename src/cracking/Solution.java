/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cracking;

import java.util.*;
import java.io.*;

/**
 *
 * @author Joseph
 */
public class Solution {
    public static void main(String args[]){
        
        
        String[] purchases = {"first:ABAC","first:HIJ","second:HIJ","second:KLM","third:NOP","fourth:ABAC","fourth:QRS","fourth:DEF","fiveth:KLM","fiveth:TUV"};
        dr("ABC",purchases);
    }
    
    static int[] dr(String itemId, String[] purchases){
        
        int ret[] = new int[2];
        String[][] records = new String[purchases.length][2];
        int validrecords = 0;
        for(int i = 0; i < purchases.length; i++){
            String[] record = purchases[i].split(":");
            if(record.length != 2){
                continue;
            }
            records[i] = record;
            validrecords++;
        }
        //Search strong
        HashSet<String> customer = new HashSet<String>();
        for(int i = 0; i < validrecords; i++){
            if(records[i][1].equals(itemId)){
                customer.add(records[i][0]);
            }
        }
        HashSet<String> recommendItem = new HashSet<String>();
        for(String cus : customer){
            for(int i = 0; i < validrecords; i++){
                if(records[i][0].equals(cus)){
                    recommendItem.add(records[i][1]);
                }
            }
        }
        ret[0] = recommendItem.size() - 1;
        //SearchWeak
        HashSet<String> preRecommendItem = new HashSet<String>();
        HashSet<String> preCustomer = new HashSet<String>();
        while(preRecommendItem.size() != recommendItem.size() && preCustomer.size() != customer.size()){
            preRecommendItem.addAll(recommendItem);
            preCustomer.addAll(customer);
            for(String item : recommendItem){
                for(int i = 0; i < validrecords; i++){
                    if(records[i][1].equals(item)){
                        customer.add(records[i][0]);
                    }
                }
                
            }
            for(String cus : customer){
                for(int i = 0; i < validrecords; i++){
                    if(records[i][0].equals(cus)){
                        recommendItem.add(records[i][1]);
                    }
                }
            }
        }
        ret[1] = recommendItem.size() - ret[0] - 1;
        return ret;
    }
}
