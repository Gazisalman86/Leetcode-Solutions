class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int lp=0; int rp=n-1;  int maxWater=0;
        while(lp<rp){
            int wdth = rp-lp;
            int hgt = Math.min(height[lp],height[rp]);
            int ans = wdth*hgt;
            maxWater = Math.max(maxWater,ans);
            if(height[lp]  < height[rp]) {
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
}