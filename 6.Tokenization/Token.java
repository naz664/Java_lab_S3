import java.util.*;
public class Token {
    
    public static void main(String[] args) {
    
     Scanner sc=new Scanner(System.in);
     int x;
     int sum=0;
     System.out.println("ENTER THE DIGITS WITH GAP");
     String n=sc.nextLine();
     StringTokenizer st=new StringTokenizer(n," ");
     while(st.hasMoreTokens()){
         String temp=st.nextToken();
         x= Integer.parseInt(temp);
         System.out.println(x);
         sum=sum+x;
     }
      System.out.println("sum= "+sum);
      sc.close();
    }
}
    

