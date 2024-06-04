//Que_31 , Pattern
public class p_9 
{
    public static void main(String[] args) 
    {
        int n=3;
        for(int k=0; k<n; k++)
        {for(int i=0;i<n;i++)
        {
            for(int j=0;j<2*n;j++)
            {
                if(i+j >= k*(n-1) && i-j >=-k*(n-1)  )
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");

                }
            }
            System.out.println();

        }
        // System.out.println();
    }
    }
    
}
