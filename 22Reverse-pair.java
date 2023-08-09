//Brute forse approch  TC O(n2)    SC(1);
class Solution {
    public int reversePairs(int[] nums) {
          
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]*2<nums[i]){
                    count++;
                }
            }
        }
        return count;
    }
}
//Optimal Approch using MergeSort    TC O(2n*logn)   SC O(n)

