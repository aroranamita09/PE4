import java.util.Scanner;


public class ParagraphFunctions {
    /**
     *  Write a program that sets up a String variable containing a paragraph of text of your choice.
     * a. Extract the words from the text and sort them into alphabetical order.
     * b. Display the sorted list of words.
     */
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       String para=sc.next();
       System.out.println(ParaToString(para));
    }
    public static String [] ParaToString(String para)
    {
        String []first=para.split(" ");
        for(int i=0;i<first.length;i++)
        {
            sort(first);
        }
        return first;
    }
    public static void sort(String [] args)
    {
        for(int i=0;i<args.length;i++)
        {
            if(args[i].charAt(0)>args[i+1].charAt(0))
                swap(args[i],args[i+1]);
        }
    }
    public static void swap(String a ,String b)
    {
        String temp=a;
        a=b;
        b=temp;
    }
}
