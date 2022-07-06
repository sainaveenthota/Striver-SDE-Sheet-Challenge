class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length, i = 0;
        if(n==1) return;
        for(i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                break;
            }
        }
        if(i>=0){
            for(int j = n-1;j>i;j--){
                if(nums[j]>nums[i]){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    break;
                }
            }
        }
        reverse(nums,i+1,n-1);
    }
    public static void reverse(int[] arr, int i, int j){
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }
    }
}
