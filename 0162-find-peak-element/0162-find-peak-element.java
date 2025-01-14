class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums[0];
        int index=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>n){
                index=i;
                n=nums[i];
            }
        }
        return index;
    }
}