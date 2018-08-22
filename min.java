class min
{
static int i;
static void min(int arr[]){  
int min=arr[0];  
for(int i=1;i<arr.length;i++)  
 if(min>arr[i])  
  min=arr[i];  
  
System.out.println(min + "is minimum present at" + i +"th index");  
}  
public static void main(String args[])
{
int a[]={33,3,4,5,34,9,5,2};
for(int x : a)
{
System.out.println(x);
}
min(a);




}
}