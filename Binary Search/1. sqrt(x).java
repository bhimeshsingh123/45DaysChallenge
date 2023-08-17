class Solution {
    public int mySqrt(int x) {
        long s = 0;
        long e = x;
        long target = x;
        long ans = -1;
        while(s<=e){
            long mid = s + (e-s)/2;
            if(mid*mid==target){
              return (int)mid;

            }else if(mid*mid<target){
               ans = mid;
               s = mid+1;

            }else{
                e = mid-1;
            }
        }
          return (int)ans;
    }
}
