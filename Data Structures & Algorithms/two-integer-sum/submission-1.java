class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer,Integer>mpp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mpp.put(nums[i], i);
        }
        System.out.println(mpp);
        for(int i=0;i<nums.length;i++){
            if(mpp.containsKey(target-nums[i]) && mpp.get(target-nums[i])!=i){
                res[0]=i;
                res[1]=mpp.get(target-nums[i]);
                break;
            }
        }
        return res;
        
    }
}
