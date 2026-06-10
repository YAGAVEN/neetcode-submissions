class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE;
        for(int i:nums){
            set.add(i);
            max = Math.max(i,max);
        }
        int maxCount = 0;
        for(int i : nums)
        {
            if(!set.contains(i-1)){
                int c = 0;
                for(int j=i;j<=max;j++){
                    if(set.contains(j)){
                        c++;
                    }else{
                        break;
                    }
                }
                maxCount = Math.max(c,maxCount);
            }else{
                continue;
            }
        }
        return maxCount;
    }
}
