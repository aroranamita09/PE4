import java.util.Scanner;

public class ReplaceChar {
    /**
     *    Write a program to replace all d with f and all l with t in the given String
     * Input: daily dry
     * Output: faity fry
     * Original string: daily dry
     * New String: faity fry
     */
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(replaceChar(str));
    }
    public static String replaceChar(String s){
        String s1=s.replace("d","f");
        String s2=s1.replace("l","t");
        return s2;

    }
}
