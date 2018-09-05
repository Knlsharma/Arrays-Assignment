import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Min_2d
{
  public static void main(String ...S) throws IOException
  {  BufferedReader b = new BufferedReader (new InputStreamReader(System.in)); //Buffered reader class imported for reading from user and putting it to memory buffer
      System.out.println("Enter the no. of arrays");   
         int m = Integer.parseInt(b.readLine());    
      System.out.println("Enter the length of each array.");   
         int n = Integer.parseInt(b.readLine());//readline() is the method of class Buffered reader  which we impliment 
     int ar [][] ,maxm = 0,maxn=0, i , j;
     ar  = new int[m][n];
      System.out.println("Enter the elements");
     for(i=0 ;i<m; i++ )
    {  for(j=0 ;j<n; j++ )
     {    ar[i][j] = Integer.parseInt(b.readLine());
        }
    }    
    for(i=0 ;i<m; i++ )
    {  for(j=0 ;j<n; j++ )
        { if(ar[i][j] < ar[maxm][maxn])
          {  maxm = i;
             maxn = j ; }
            }
        }
    System.out.println("Min element is : " + ar[maxm][maxn] +".\nFound in array : "+(maxm+1)+".\nAt position : " +(maxn+1)+"." );
    }
}