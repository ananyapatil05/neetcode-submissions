class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> freq = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        int[] ans = new int[k];
        int k2 = k;
        while(k2>0){
            int maxCount = Integer.MIN_VALUE;
            int val = 0;

            for(Integer x : freq.keySet()){
                int y = freq.get(x);

                if(y>maxCount){
                    maxCount = y;
                    val = x;
                }    
                
            }
            ans[k-k2] = val;
            freq.remove(val);
            k2--;
        }
        return ans;
    }
}
