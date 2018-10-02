import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class max_in_row
{
     public static void main(String ...S) throws IOException
    {  BufferedReader b = new BufferedReader (new InputStreamReader(System.in)); //Buffered reader class imported for reading from user and putting it to memory buffer
      System.out.println("Enter the no. of arrays");   
         int m = Integer.parseInt(b.readLine());    
      System.out.println("Enter the length of each array.");   
         int n = Integer.parseInt(b.readLine());//readline() is the method of class Buffered reader  which we impliment 
     int ar [][] ,max = 0,f=0, i , j;
     ar  = new int[m][n];
      System.out.println("Enter the elements");
     for(i=0 ;i<m; i++ )
    {  for(j=0 ;j<n; j++ )
     {    ar[i][j] = Integer.parseInt(b.readLine());
        }
    }    
                
                   
    for( i=0;i<m;i++)
                {
                    for( j=0; j<n;j++)
                    { System.out.print(ar[i][j]+" ");
                        if(ar[i][j]>max)
                        {
                            max=ar[i][j];
                        }
                      
                    }
                    System.out.print("\t <max>"+max+"\n");
                   
                    max=0;
                }
 }
}
