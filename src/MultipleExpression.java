import java.util.Scanner;

public class MultipleExpression {

    public static  void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String inputStr=sc.next();
        String given=sc.next();
        int len=given.length();
        int endInd=0;
        while(endInd<inputStr.length())
        {
            int startIndex=occurence(inputStr,given);
            int endIndex=startIndex+len;
            System.out.println("Found at:"+startIndex +"-"+endIndex);
            endInd=occurence(inputStr,given);
        }
    }
    public static int occurence(String str,String givenWord)
    {
      int  startIndex=str.indexOf(givenWord);

        return startIndex;
    }
    }

