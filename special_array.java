// Que : 51 : Leetocode Q_No-1608 
class Solution {
    public int specialArray(int[] nums) {
        int count=0;
        
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                count =count+1;
                

            }            
        }
        if(count==0)
        {
            return -1;
        }
        
        for(int j=0;j<=nums.length;j++)
        {
            int c2=0;
            for(int k=0;k<nums.length;k++)
            {
                if(nums[k] !=0)
                {
                    if(nums[k]>=j)
                    {
                        c2++;
                    }
                }
            }
            
            if(j==c2)

            {
                return j;
                
                
            }            
        }
        return -1;
    }
}        
            