// Que : 55 : Leetocode Q_No-551 
class Solution {
    public boolean checkRecord(String s) 
    {
        
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            
            if(i<=(s.length()-3) && s.charAt(i) =='L' &&  s.charAt(i+1) =='L'&& s.charAt(i+2) =='L')
            {
                return false;
            }
            else if(s.charAt(i)=='A')
            {
                count++;
            }
            
            
            
            
            

        }
        if(count >= 2)
            {
                return false;
            }

        

        
        
        return true;
        
            
            



        
        
    }
}