// Que : 54 : Leetocode Q_No-896 

class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums[0]<=nums[(nums.length)-1])
        {
            for(int i=0;i<nums.length-1;i++)
            {
                if(nums[i]>nums[i+1])
                {
                    return false;
                }
               
            }

        }
        else
        {
            for(int j=0;j<nums.length-1;j++)
            {
                if(nums[j]<nums[j+1])
                {
                    return false;
                }
            }

        }
        return true;
        
    }
}
