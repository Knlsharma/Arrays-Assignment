class max
{
static int i;
static void max(int arr[]){  
int max=arr[0];  
for(int i=1;i<arr.length;i++)  
 if(max<arr[i])  
  max=arr[i];  
  
System.out.println(max + "is max present at" + i +"th index");  
}  
public static void main(String args[])
{
int a[]={33,3,4,5};
for(int x : a)
{
System.out.println(x);
}
max(a);




}
}