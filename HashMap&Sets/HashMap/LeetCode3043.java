import java.util.HashSet;

import java.util.*;
class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> s=new HashSet<>();

        for(int val:arr1){
            while(!s.contains(val)&& val>0){
                s.add(val);
                val/=10;
            } 
        }    
        double result=0;
        for(int val:arr2){
            while(!s.contains(val) && val>0)
                val/=10;
            
            if(val > 0){
                result=Math.max(result,(Math.log10(val)+1));
            }
        }
        return (int)result;

    }
}