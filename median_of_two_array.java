// Que : 54 : Leetocode Q_No-4 

class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int k=0;
        double[] c=new double[(nums1.length+nums2.length)];

        for(int i=0;i<nums1.length;i++)
        {
            c[i]=nums1[i];
            k++;
            
        }
        for(int j=0;j<nums2.length;j++)
        {
            c[k]=nums2[j];
            k++;
        }
        Arrays.sort(c);
        
        double m=0;
        if((k)%2==0)
        {
            int a=k/2;
            m=(c[a]+c[a-1])/2;
        }
        else
        {
            m=c[k/2];
        }
        
        return m;

        
        
    }
}