class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        // Step 1: Count frequencies
        Map<String, Integer> map = new HashMap<>();
        for(String w : words){
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        // Step 2: Max Heap
        PriorityQueue<String> pq = new PriorityQueue<>(
            (a, b) -> {
                int freqCompare = map.get(b) - map.get(a);
                if(freqCompare == 0){
                    return a.compareTo(b); 
                }
                return freqCompare;
            }
        );

        pq.addAll(map.keySet());

        // Step 3: Extract top k
        List<String> res = new ArrayList<>();
        for(int i = 0; i < k; i++){
            res.add(pq.poll());
        }

        return res;
    }
}
