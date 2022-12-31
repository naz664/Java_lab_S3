import java.util.Scanner;
import java.io.IOException;
public class Matrix {

   
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);    
        System.out.println("ENTER THE ROW OF FIRST MATRIX");
        int row1 = sc.nextInt();
        System.out.println("ENTER THE COLUMN OF FIRST MATRIX");
        int col1 = sc.nextInt();
        System.out.println("ENTER THE ROW OF SECOND MATRIX");
        int row2 = sc.nextInt();
        System.out.println("ENTER THE COLUMN OF SECOND MATRIX");
        int col2 = sc.nextInt();
        if(col1!=row2)
        {
          System.out.println("multiplication is not possible");
          return;
        }
        
       int i,j,k;
           int [][] a = new int [row1][col1];
           int [][] b = new int [row2][col2];
           int [][] c = new int [col1][row2];
            try{
          System.out.println("ENTER THE ELEMENTS OF FIRST MATRIX");
          for( i=0;i<row1;i++)
          {
              for( j=0;j<col1;j++)
              {
                  a[i][j]=sc.nextInt();
                  
          }
        }
          System.out.println("ENTER THE ELEMENTS OF SECOND MATRIX");
          for(i = 0;i<row2;i++)
          {
              for(j=0;j<col2;j++)
              {
                  b[i][j]=sc.nextInt();
              }
          }
          System.out.println("The multiplied metrix is:");
          for( i=0;i<row1;i++)
          {
              for( j=0;j<col2;j++)
              {
                  c[i][j]=0;
 
              for( k=0;k<col1;k++)
              {
                  c[i][j]+=a[i][k]*b[k][j];
              }
              }
          }
        
      
            for(i=0;i<row1;i++)
            {
                for (j=0;j<col2;j++)
                {
                    System.out.print(c[i][j] +" ");
                }
                System.out.println();
        
                
            }
    }catch(Exception e){}
        
    }
}

