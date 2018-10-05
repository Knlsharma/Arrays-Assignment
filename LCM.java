
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LCM
{
  public static void main(String ...S) throws IOException
  {  BufferedReader b = new BufferedReader (new InputStreamReader(System.in)); 
           System.out.println("Enter the length of array");   
         int l = Integer.parseInt(b.readLine());//readline() is the method of class Buffered reader  which we impliment 
     int ar [] , i , in = 0 ,max = 1;
     ar  = new int[l];
      System.out.println("Enter the elements");
     for(i=0 ;i<l; i++ )
     {    ar[i] = Integer.parseInt(b.readLine());
         max = ar[i]*max ;
        }
  
         for(i=1 ;i <= max ; i++ )
     {   for(int j=0 ; j<l;j++)
       {  if(i%ar[j]!=0) 
           { break; }
           if(j==l-1)
           { in = i ;}
          }
         if(in!=0)
           {   break;
               }
        }
     System.out.println("The LCM is : "+in);  
    }
   }