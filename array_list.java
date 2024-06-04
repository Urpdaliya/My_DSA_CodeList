// Que_49 , Array List
import java.util.*;
public class array_list 
{
    public static void main(String[] args)
    {
        ArrayList <Integer> list=new ArrayList <Integer>();
        //add element
        list.add(9);
        list.add(8);
        list.add(7);
        
        System.out.println(list);

        //modify element as per index
        list.add(0,1);
        System.out.println(list);

        //get element
        int a=list.get(0);
        System.out.println(a);

        //delete element
        list.remove(3);
        System.out.println(list);

        //sort list
        Collections.sort(list);
        System.out.println(list);
    }
}
