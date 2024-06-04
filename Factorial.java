//Que_34 , Factorial in java
import java.util.*;

public class Factorial 
{
    public static void factorialofnumber(int n)
    {
        int fact=1;

        for(int i=1;i<=n;i++)
        {
            fact=fact*i;

        }
        System.out.println(fact);
        
    }
    public static void main(String[] args) {
        System.out.println("enter number : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        factorialofnumber(n);


    }
    
}
