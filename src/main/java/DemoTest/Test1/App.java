package DemoTest.Test1;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       String s="abc123jrfhjf";
       s=s.replaceAll("[A-Za-z]", "0");
       int sum=0;      
       char[]ch=s.toCharArray();
       for(int i=0;i<ch.length;i++) {
    	   sum=sum+Character.getNumericValue(ch[i]);
       }   
       System.out.println(sum);
    }
}
