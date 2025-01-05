class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> set=new HashMap<Integer,Integer>();
        for(int i=0;i<=nums.length;i++){
            int temp=target-nums[i];

            if(set.containsKey(temp)){
                return new int[]{set.get(temp),i};
            }
            set.put(nums[i],i);

        }
        return null;
        
    }
}