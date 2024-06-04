//Que_41 , Recursion : sum
public class recursion_2 
{
    public static void printNum(int n,int sum,int i)
    {
        
        if(i==n)
        {
            sum=sum+i;
            System.out.println(sum);
            return;

        }
        sum=sum+i;
        printNum(n,sum,i+1);
        
        
        
    }
    public static void main(String[] args) 
    {
        printNum(7,0,2);
        
    }
    
}
