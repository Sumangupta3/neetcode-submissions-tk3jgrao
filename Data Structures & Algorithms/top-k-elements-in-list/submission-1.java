class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res= new int[k];
        Map<Integer, Integer> mpp= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> maxq = new PriorityQueue<>((a,b)->{
         if(a.getValue().equals(b.getValue())){
           return b.getKey() - a.getKey();
         } else {
            return b.getValue()-a.getValue();
         }
        }
        );
        maxq.addAll(mpp.entrySet());
        for(int i=0;i<k;i++){
            res[i]= maxq.poll().getKey();
        }
        return res;
        
    }
}
