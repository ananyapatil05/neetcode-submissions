class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> nonDuplicates = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(!nonDuplicates.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}