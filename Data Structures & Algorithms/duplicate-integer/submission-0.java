class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            if(map.get(i)==null){
                map.put(i, 0);
                System.out.println(i);
            }else{
                return true;
            }
        }
        return false;
    }
}