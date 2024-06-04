//Que_45 , Recursion : 
public class recu3 
{
    public static void sumOfNum(int i,int n,int sum)
    {
        if(n==i)
        {
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum += i;
        sumOfNum(i+1,n,sum);

    }
    public static void main(String[] args)
    {
        sumOfNum(1,500,0);
    }

    
    
}
