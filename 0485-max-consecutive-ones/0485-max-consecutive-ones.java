class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int total=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            if(nums[i]!=1){
                count=0;
            }
            if(count>total){
                total=count;
            }
        }
        return total;
    }
}