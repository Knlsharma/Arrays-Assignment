import java.util.Arrays;
import java.util.Scanner; 
class sort
{
public static void main(String args[])
{
Scanner x=new Scanner(System.in);
System.out.println("Enter total elements");
int alength;
alength=x.nextInt();
int arr[]=new int [alength];     //taking size
for(int i=0;i<alength;i++)                    //reading elements
{
System.out.println("ELEMENT entered are" + (i+1));     
arr[i]=x.nextInt();
}
x.close();
for(int i=0;i<alength;i++)           // printing array
{
System.out.println("entered are " + arr[i] + "");
}
System.out.println("Using function");
Arrays.sort(arr);
System.out.println(Arrays.toString(arr));

for(int i=alength-1;i>=0;i--)                // reverse elements
{
System.out.println("reverse is  " + arr[i]);
}

sort(arr);
static void sort(int num[])             // bubble sort
     { 
       int i, j, temp; 
       for(i=0; i<num.length-i;i++) 
           {  
               for(j=0; j<num.length-i-1;j++) 
                   { 
                        if(num[j]>num[j+1]) 
                          { 
                               temp = num[j]; 
                               num[j] = num[j+1]; 
                               num[j+1] = temp; 
                          } 
                   } 
           } 
     } 

}}


