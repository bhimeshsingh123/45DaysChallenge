class Solution {
    public int removeDuplicates(int[] nums) {

        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                nums[i-1] = 101;
            }
        }
        int j=0;
        for(int i=0;i<nums.length;i++){
        if(nums[i] != 101){
            nums[j] = nums[i];
            j++;
        }
    }
        return j;
    }
}
