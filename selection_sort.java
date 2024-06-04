//Que_42 , Selection sort  
public class selection_sort 
{
    public static void print(int arr[])
    {
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k]+" ");

        }
        
    }
    public static void main(String[] args) {
        int [] arr={9,8,7,6,1,2};
        
     
        for(int i=0;i<arr.length-1;i++)
        {
            int small=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[small]>arr[j])
                {
                    small=j;
                }
            }
            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;

            
            

        }
        print(arr);
        
    }
    
}
