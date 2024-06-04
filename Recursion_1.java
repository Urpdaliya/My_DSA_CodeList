//Que_40 , Recursion : print numbers
public class Recursion_1
{
    public static void printNum(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }
    public static void main(String[] args) 
    {
        printNum(9);
        printNum(5);
        
    }
    
}
