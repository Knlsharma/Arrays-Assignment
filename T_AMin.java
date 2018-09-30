import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class T_AMin
{ static int m ,n ;
    static void TriangleAMin(int [][]x1)
            {
                int g=0,min= x1[1][1];
                for(int i=0; i<m; i++)
                {
                    for(int j=g; j<n; j++)
                    {
                        if(x1[i][j]<min)
                        {
                        min=x1[i][j];
                        }
                    }
                    g++;
                }
                System.out.println("Min = "+ min);
            }
         
  public static void main(String ...S) throws IOException
  {  BufferedReader b = new BufferedReader (new InputStreamReader(System.in)); //Buffered reader class imported for reading from user and putting it to memory buffer
       
      System.out.println("Enter the no. rows and columns ");   
         m = n = Integer.parseInt(b.readLine());    
       
     int ar [][] ,minm = 0,minn=0, i , j;
     ar  = new int[m][n];
      System.out.println("Enter the elements");
     for(i=0 ;i<m; i++ )
    {  for(j=0 ;j<n; j++ )
     {    ar[i][j] = Integer.parseInt(b.readLine());
          
       }
    }   
    
   TriangleAMin(ar);
  }
}