import java.util.*;

class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] rem=new int[k];
        Arrays.fill(rem,0);

        for(int num : arr){
            int r=(num%k + k) % k;
            rem[r]++;
        }
        if(rem[0]%2!=0) return false;
        for(int i=1;i<=k/2;i++){
            int otherHalf=k-i;
            if(rem[otherHalf]!=rem[i]) return false;
        }
        return true;
    }
}