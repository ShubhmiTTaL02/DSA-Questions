package BitManipulation;

class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int res=0;
        for(int i: nums){
            res=res^i;
        }
        for(int i=0;i<=n;i++){
            res=res^i;
        }
        return res;
    }
}