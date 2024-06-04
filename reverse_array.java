//Que_35 , Reverse of array element in java
import java.util.*;

class reverse_array
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array : ");
        int l=sc.nextInt();
        int[] a=new int[l];
        System.out.println("Enter elments of array : ");
        for(int i=0;i<l;i++)
        {
            
            a[i]=sc.nextInt();

        }
        System.out.println("Your orignal array : ");
        for(int j=0;j<l;j++)
        {
            System.out.print(a[j]+" ");
        }
        System.out.println();
        System.out.println("Reverse of this array : ");

        for(int k=l-1;k>=0;k--)
        {
            System.out.print(a[k]+" ");
        }

    }
}