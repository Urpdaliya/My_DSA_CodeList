//Que_33 , Multiplication
import java.util.*;

public class F_2 
{
    public static int calculate(int a,int b)
    {
        int mul=a*b;
        return mul;
    }
    public static void main(String args[])
    {
        System.out.println("Enter two numbers : ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Multipliaction of 2 number is : "+calculate(a,b));


    } 
}
