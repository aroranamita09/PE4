import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CharacterOccurence {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println("Enter the character to be count");
        String  toCount=sc.next();
        countCharacters(str,toCount);
    }
    public static void countCharacters(String str,String toCount)
    {
        int number=0;
        int lengthCount=toCount.length();
        int firstindex=str.indexOf(toCount);
        System.out.println(firstindex+"to"+(firstindex+lengthCount));
        int nextIndex=firstindex+str.substring(firstindex+lengthCount,str.length()).indexOf(toCount);
        System.out.println(nextIndex+"to"+(nextIndex+lengthCount));
        int secondIndex=nextIndex+str.substring(firstindex+1,str.length()).indexOf(toCount);
        System.out.println(nextIndex+"to"+(nextIndex+lengthCount));
    }
}int secondIndex=
