//Que_37 , Get the 3rd bit (position = 2) of a number.(n=0101)
public class bit_manu_1
{
    public static void main(String[] args) 
    {
        int n=5;
        int b=1<<2;//here 2 means position 2 and 1 is constant
        int f=b & n;
        if(f==0)
        {
            System.out.println("0");
        }
        else{
            System.out.println("1");
        }
    }
    
}
