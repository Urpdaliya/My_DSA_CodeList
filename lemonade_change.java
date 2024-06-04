// Que : 52 : Leetocode Q_No-860

class Solution {
    public boolean lemonadeChange(int[] bills) 
    {
        int bill5=0;
        int bill10=0;
        int bill20=0;

        for(int i=0;i<bills.length;i++)
        {
            if(bills[i]==5)
            {
                bill5++;
            }
            else if(bills[i]==10)
            {
                if(bill5==0)
                {
                    return false;
                }
                else
                {
                    bill10++;
                    bill5--;
                }
            }
            else
            {
                if((bill5<=2 && bill10==0) || (bill10>=1 && bill5==0) || bill5==0)
                {
                    return false;
                }
                else if(bill5>=3 && bill10==0)
                {
                    
                    bill5-=3;
                }
                else 
                {
                    
                    
                    bill10--;
                    bill5--;
                }
                
                
                

                

            }
        }
        return true;
        
    }
}