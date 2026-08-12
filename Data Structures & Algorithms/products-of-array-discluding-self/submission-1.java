class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length == 0) return new int[0];
        int[] prefix = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            if(i == 0) prefix[i] = 1;
            else prefix[i] = prefix[i-1] * nums[i-1];
        }
        int[] suffix = new int[nums.length];
        for(int i = nums.length-1; i>=0; i--){
            if(i == nums.length-1) suffix[i] = 1;
            else suffix[i] = suffix[i+1] * nums[i+1];
        }
        int[] ret = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            //System.out.println(prefix[i] + "  " + suffix[i]);
            ret[i] = prefix[i] * suffix[i];
        }
        return ret;
    }
}  
