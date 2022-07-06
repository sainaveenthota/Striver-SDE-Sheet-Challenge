class Solution {
    public int maxSubArray(int[] nums) {// Kadane's algo
        int n = nums.length, max = nums[0], sum = 0;
        for(int i=0;i<n;i++){
            sum += nums[i];
            max = Math.max(sum,max);
            if(sum<0) sum = 0;
        }
        return max;
    }
}
