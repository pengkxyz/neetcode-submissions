class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            int[] freq = new int[26];
            for(char c : s.toCharArray()){
                freq[c-'a']++;
            }
            if(map.get(Arrays.toString(freq)) == null){
                map.put(Arrays.toString(freq), new ArrayList<String>(List.of(s)));
            }else{
                //System.out.println(map.get(Arrays.toString(freq)).toString());
                map.get(Arrays.toString(freq)).add(s);
            }
        }
        List<List<String>> stemp = new ArrayList<>(map.values());
        return stemp;
    }
}
