
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class median
{ public static void main(String ...S) throws IOException //----------------------------------------SORT---------------------
    {
        
        
            BufferedReader b = new BufferedReader (new InputStreamReader(System.in)); //Buffered reader class imported for reading from user and putting it to memory buffer
           System.out.println("Enter the length of array");   
         int l = Integer.parseInt(b.readLine());
       int i = 0 ;
        float x[]  = new float[l];
       System.out.println("Enter the elements");
        for(i=0 ;i<l; i++ )
         {    x[i] = Integer.parseInt(b.readLine());
           }

         float temp;
          for(i=0;i<x.length;i++)  
          {
              for(int j=i+1;j<x.length;j++)
              {
                  if(x[i]>x[j])
                  {
                      temp = x[i];
                      x[i]=x[j];
                      x[j]=temp;
                  }
              }
          }
          
            if(l%2 == 0)
               System.out.println("The Median is :"+ ((x[((l/2)-1)]+x[l/2])/2.0f));
              else
              System.out.println("The Median is :"+ x[(l-1)/2]);
               
    }
}