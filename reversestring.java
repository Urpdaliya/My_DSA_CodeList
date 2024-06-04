//Que_38 , Reverse string
import java.util.*;
class reversestring
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name=sc.nextLine();
        System.out.println(name);
        System.out.println("Reverse of your name is : ");
        for(int i=name.length()-1;i>=0;i--)
        {
            System.out.print(name.charAt(i));

        }
        
    }
}

// second method 

// import java.util.*;
// class reversestring
// {
//     public static void main(String[] args) 
//     {
//         Stringbuilder sb=new Stringbuilder("Utsav");
//         
//         System.out.println(sb);
//         System.out.println("Reverse of your name is : ");
//         for(int i=0;i<sb.length()/2;i++)
//         {
//             int front=i;
//             int back=sb.length()-1-i;
//             char frontChar=sb.charAt(front);   
//             char backChar=sb.charAt(front);
//             sb.setChatAt(front.backChar);
//             sb.setCharAt(back,frontChar);
//         }
//         system.out.println(sb);
        
//     }
// }