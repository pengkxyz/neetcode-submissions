class Solution {

    public String encode(List<String> strs) {
        StringBuilder ret = new StringBuilder();
        List<Integer> sizes = new ArrayList<>();
        for(String s : strs){
            sizes.add(s.length());
        }
        for(int i = 0; i<sizes.size(); i++){
            ret.append(sizes.get(i) + ",");
        }
        ret.append("#");
        for(int i = 0; i<sizes.size(); i++){
            ret.append(strs.get(i));
        }
        return ret.toString();
    }

    public List<String> decode(String str) {
        List<String> ret = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();
        int i = 0;
        while(str.charAt(i) != '#'){
            int start = i;
            while(str.charAt(i)!=','){
                i++;
            }
            sizes.add(Integer.parseInt(str.substring(start, i)));
            i++;
        }
        i++;

        System.out.println(str + i);
        for(int s : sizes){
            ret.add(str.substring(i, i+s));
            i += s;
        }

        return ret;
    }
}
