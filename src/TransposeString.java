import java.util.Scanner;

public class TransposeString {

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String inputStr=sc.next();
        System.out.println(transpose(inputStr));
    }
    public static String[] transpose(String str)
    {
        String []breakStr=str.split(" ");
        String []transposed=new String[breakStr.length];
        for(int i=0;i<breakStr.length;i++)
        {
            transposed[i]=reverse(breakStr[i]);
        }return transposed;
    }
    public static String reverse(String str)
    {
        String str1="";
        for(int i=str.length();i>0;i--)
        {
            str1+=str.charAt(i);
        }return str1;
    }
}
