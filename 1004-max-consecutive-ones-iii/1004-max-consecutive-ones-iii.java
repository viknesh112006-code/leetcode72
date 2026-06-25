class Solution {
    public int longestOnes(int[] nums, int k) {
        int r=0;
        int l=0;
        int max =0;
        int z=0;
        for(int i=r;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                z++;
            }
            while(z>k)
            {
                if(nums[l]==0)
                {
                    z--;
                }
                    l++;
            }
            if(z<=k)
            {
           
            max = Math.max(max,r-l+1);
            }
            r++;
        }
        return max;
    }
}