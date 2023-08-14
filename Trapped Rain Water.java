class Solution {
    public int trap(int[] height) {
        int n = height.length;
        //Create right max Auxilary Array
        int right[] = new int[n];
        right[0] = height[0];
        for(int i=1;i<height.length;i++){
            right[i] = Math.max(right[i-1],height[i]);
        }

        //Create left max Auxilary Array
        int left[] = new int[n];
        left[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            left[i] = Math.max(left[i+1],height[i]);
        }

        //loop   1. Calculate water level
        //       2.Trapped_Water = ()water_level - height_of_bar)*width
        int trapped_water=0;
        for(int i=0;i<height.length;i++){
            int water_level = Math.min(left[i],right[i]);
            trapped_water += (water_level-height[i])*1;
        }
    
        return trapped_water;
    
    }
}
