import java.util.Scanner;
import java.io.IOException;
public class Frequency {


    public static void main(String[] args) {
         Scanner obj=new Scanner(System.in);
         System.out.println("Enter the string");
         String str = obj.nextLine();
         System.out.println("Enter a character");
         String k = obj.nextLine();
         int l= str.length();
         int count=0;
         for(int i=0;i<l;i++)
         {
             if (str.charAt(i) == k.charAt(0))
             count++;
         }
         System.out.println("The frequency of the given character is "+count);
    }
}

