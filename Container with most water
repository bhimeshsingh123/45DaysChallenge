//brute force Approch
class Solution {
    public int maxArea(int[] height) {
         int area = 0;
         int temp = 0;
        for(int i=0;i<height.length;i++){
           for(int j=i+1;j<height.length;j++){
                 int water = Math.min(height[i],height[j]);
                 temp = water*(j-i); 
                 if(temp>area){
                     area=temp;
                 }
        } 
        }
        return area;
    }
}

// 2 pointer Approch 

class Solution {
    public int maxArea(int[] height) {
          int maxWater = 0;
          int lp=0;
          int rp=height.length-1;
          while(lp<rp){
              int min = Math.min(height[lp],height[rp]);
              int width = rp-lp;
              int temp = min*width;
               maxWater = Math.max(maxWater,temp);
               if(height[lp]<height[rp]){
                   lp++;
               }else{
                   rp--;
               }
          }
        return maxWater;
    }
}
