
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class HCF
{
  public static void main(String ...S) throws IOException
  {  BufferedReader b = new BufferedReader (new InputStreamReader(System.in)); 
           System.out.println("Enter the length of array");   
         int l = Integer.parseInt(b.readLine());//readline() is the method of class Buffered reader  which we impliment 
     int ar [] , i , in = 0 ,min = 0;
     ar  = new int[l];
      System.out.println("Enter the elements");
     for(i=0 ;i<l; i++ )
     {    ar[i] = Integer.parseInt(b.readLine());
        
        }
         for(i=0 ;i<l; i++ )
     { if(ar[i] < ar[min])
        min = i;
            }
        
            for(i=1 ;i <= ar[min] ; i++ )
     {   for(int j=0 ; j<l;j++)
       {  if(ar[j]%i!=0) 
           { break; }
           if(j==l-1)
           { in = i ;}
          }
       
        }
     System.out.println("The HCF is : "+in );  
    }
   }