    import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class mode
{
  public static void main(String ...S) throws IOException
  {  BufferedReader b = new BufferedReader (new InputStreamReader(System.in)); //Buffered reader class imported for reading from user and putting it to memory buffer
           System.out.println("Enter the length of array");   
         int l = Integer.parseInt(b.readLine());//readline() is the method of class Buffered reader  which we impliment 
     int max = 0, i, c  , k , c1 ;
     k = c = c1 = 0 ; 
     float ar[]  = new float[l];
     
     int fr[]  = new int[l];
      float fr1[]  = new float[l];
      System.out.println("Enter the elements");
     for(i=0 ;i<l; i++ )
     {    ar[i] = Float.parseFloat(b.readLine());
        }
      
    for(i=0 ;i<l; i++ )
     {  for (int j = 0 ; j < l ; j++)
         {     
            if(ar[i] == ar [j])
               {  c1++; 
                    }
            
                }  
                fr[i] = c1;
               c1 = 0 ;
    }
    for (int j = 0 ; j < l ; j++)
         {    if (fr[max] > fr[j])
             {  max = j ;
                }
        }  
        max = fr[max];
       System.out.println("The mode(s) is(are) : " );
       c1 = 0 ; 
       for(i=0 ;i<l; i++ )
     { if (fr[i]==max)
        { fr1[k++] = ar[i] ;
            for(int j = 0 ; j < k ; j++)
               {  if(ar[i]==fr1[j]) 
                  {c1++;}
                    }
                 if(c1==1)
                 {System.out.print(" "+ ar[i]+" ");
                   c1 = 0 ;
                }
                
           } 
     }

   }

}
