class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> list1 = new ArrayList<Integer>();

        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                list1.add(nums[i]);
            }
        }
         return list1;
    }
}
