// Que_48 , Recursion : find x^n where complexity is logn
public class recu6 
{
    public static int calpower(int x,int n)
    {
        if(n==0 )
        {
            return 1;

        }
        if(x==0)
        {
            return 0;

        }
        //if n is even
        if(n%2==0)
        {
            return calpower(x,n/2)*calpower(x,n/2);

        }
        else{
            return calpower(x, n/2)*calpower(x, n/2)*x;
        }

        
    }
    public static void main(String[] args) 
    {
        int x=2,n=5;
        int r=calpower(x, n);
        System.out.println(r);
        
    }

    
}
