class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> values = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int needed = target - nums[i];

            if(values.containsKey(needed)){
                int j = values.get(needed);
                return new int[]{Math.min(i,j),Math.max(i,j)};
            }
            values.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
