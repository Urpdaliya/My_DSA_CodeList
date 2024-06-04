//Que_36 , Find a number in two dimentional array and return index number
import java.util.Scanner;
class TwoDarray_1
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int rows=sc.nextInt();
        System.out.println("Enter number odf colums : ");
        int cols=sc.nextInt();
        int[][] numbers=new int[rows][cols];
        System.out.println("Enter element of array : ");
        for(int i=0;i<rows;i++)
        {
            
            for(int j=0;j<cols;j++)

            {
                
                numbers [i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter element x : ");
        int x=sc.nextInt();
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(numbers[i][j]==x)
                {
                    System.out.println("index number of x is : " + "("+i +","+ j+")");
                }
                
            }
        }
        
    }
}