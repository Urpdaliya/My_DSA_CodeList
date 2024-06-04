//Que_37 , set the 2nd bit(postion =1 )of a number n=0101.
public class bit_manu_2 
{
    public static void main(String[] args) {
        int n=5;
        int pos=1;
        int bit_mask=1<<pos;
        int op=bit_mask | n;
        System.out.println(op);

    }
    
}
