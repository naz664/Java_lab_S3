import java.util.Scanner;

public class Exc {
    
static void div(int num,int den) throws ArithmeticException
  {
    if(den==0)
        
        throw new ArithmeticException("division by zero is not possible");

     else
        System.out.println("The result is : "+num/den);
        
     }
    
    public static void main(String[] args) {
       try{
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the numerator : "); 
                    int num=sc.nextInt();
                    System.out.print("Enter the denominator : ");
                    int den=sc.nextInt();
                    div( num,den);
       }catch(Exception e)
       {
           System.out.println(e);
       }
       finally{System.out.println("Final block has been executed");}
    }
    
}
