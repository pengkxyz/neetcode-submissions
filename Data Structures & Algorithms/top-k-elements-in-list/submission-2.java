class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        PriorityQueue<int[]> minheap = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        for(int i : nums){
            freq.put(i, freq.getOrDefault(i, 0)+1);
            //System.out.println(freq.get(i));
        }
        freq.forEach((key, val) -> {
            minheap.add(new int[]{key, val});
            if (minheap.size() > k) {
                minheap.poll();
            }
        });
        int s = minheap.size();
        int[] arr = new int[s];

        for(int i = 0; i<s; i++){
            arr[i] = minheap.poll()[0];
        }
        return arr;
    }
}
