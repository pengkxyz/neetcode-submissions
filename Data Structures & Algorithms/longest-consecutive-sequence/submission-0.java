class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hashset = new HashSet<>();
        for(int i : nums){
            hashset.add(i);
        }
        int ret = 0;
        for(int i : nums){
            if(!hashset.contains(i-1)){
                int count = 1;
                while(hashset.contains(i+1)){
                    count++;
                    i++;
                }
                ret = Math.max(count, ret);
            }
        }
        return ret;
    }
}
