class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int[] pre = new int[len];
        int[] suf = new int[len];
        pre[0] = height[0];
        for(int i=1;i<len;i++){
            pre[i] = Math.max(height[i],pre[i-1]);
        }
        suf[len-1] = height[len-1];
        for(int i=len-2;i>=0;i--){
            suf[i] = Math.max(height[i],suf[i+1]);
        }
        int water = 0;
        for(int i=0;i<len;i++){
            if(height[i]<pre[i] && height[i]<suf[i]){
                water += Math.min(pre[i],suf[i]) - height[i];
            }
        }
        return water;
        
    }
}
