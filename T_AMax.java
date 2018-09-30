import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class T_AMax
{ static int m ,n ;
    static void TriangleAmax(int [][]x1)
            {
                int g=0,max= x1[1][1];
                for(int i=0; i<m; i++)
                {
                    for(int j=g; j<n; j++)
                    {
                        if(x1[i][j]>max)
                        {
                        max=x1[i][j];
                        }
                    }
                    g++;
                }
                System.out.println("max = "+ max);
            }
         
  public static void main(String ...S) throws IOException
  {  BufferedReader b = new BufferedReader (new InputStreamReader(System.in)); //Buffered reader class imported for reading from user and putting it to memory buffer
       
      System.out.println("Enter the no. rows and columns ");   
         m = n = Integer.parseInt(b.readLine());    
       
     int ar [][] ,maxm = 0,maxn=0, i , j;
     ar  = new int[m][n];
      System.out.println("Enter the elements");
     for(i=0 ;i<m; i++ )
    {  for(j=0 ;j<n; j++ )
     {    ar[i][j] = Integer.parseInt(b.readLine());
          
       }
    }   
    
   TriangleAmax(ar);
  }
}
