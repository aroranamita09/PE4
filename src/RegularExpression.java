import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println("Is Harry here ?"+checkHarry(str));
    }
    public static String checkHarry(String str)
    {
        Pattern p= Pattern.compile("Harry");
        Matcher m=p.matcher(str);
        while(m.find())
        {
            return "Is Harry here ? true";
        }return "Is Harry here ? false";
        }
}
