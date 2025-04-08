class Solution {
    public int singleNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int k=count(nums[i],nums);
            if(k<=1){
                return nums[i];
            }
        }
        return nums[0];
    }
    public int count(int num,int []arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                count++;
            }
        }
        return count;
    }
}