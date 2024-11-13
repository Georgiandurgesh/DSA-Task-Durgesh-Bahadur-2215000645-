class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
         Arrays.sort(nums);
        long ans = 0;
        int n = nums.length;
        
        for (int i = 0; i < n - 1; i++) {
            int l = lower - nums[i];
            int u = upper - nums[i];
            
            int l1 = lowerBound(nums, l, i + 1);
            int u1 = upperBound(nums, u, i + 1);
            
            ans += (u1 - l1);
        }
        
        return ans;
    }
     private int lowerBound(int[] nums, int value, int start) {
        int low = start, high = nums.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < value) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
    
    // Custom upperBound function
    private int upperBound(int[] nums, int value, int start) {
        int low = start, high = nums.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] <= value) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}