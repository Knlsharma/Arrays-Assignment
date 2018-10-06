import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class mean
{
  public static void main(String ...S) throws IOException
  {  BufferedReader b = new BufferedReader (new InputStreamReader(System.in)); //Buffered reader class imported for reading from user and putting it to memory buffer
           System.out.println("Enter the length of array");   
         int l = Integer.parseInt(b.readLine());//readline() is the method of class Buffered reader  which we impliment 
     int  i ;
     float avg , sum ;
     avg = sum = 0 ;
     float ar[] = new float[l];
      System.out.println("Enter the elements");
     for(i=0 ;i<l; i++)
     {    ar[i] = Integer.parseInt(b.readLine());
          sum = sum + ar[i];
        }
      
       System.out.println("The Mean is : " +(sum/l));
    }
}
