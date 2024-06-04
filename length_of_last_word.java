// Que : 56 : Leetocode Q_No-58

class Solution {
    public int lengthOfLastWord(String s) 
    {
        int count=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            
            if(s.charAt(i)!=' ')
            {
                count++;
            }
            if(s.charAt(i)==' ' && count > 0)
            {
                if(s.length()==1 && s.charAt(0)!=' ')
                {
                count =1;
                
                }
                break;

            }
            
        }
        
        return count;
        
    }
}
