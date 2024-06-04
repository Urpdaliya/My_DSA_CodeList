// //Que_46 , Recursion : Factorial of number
public class recu4 
{
    public static int factOfnum(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
            
        }       
        return n*factOfnum(n-1);

    }
    public static void main(String[] args) {
        int n=4;
        int r=factOfnum(n);
        System.out.println(r);
        
    }
}
