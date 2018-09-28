import java.util.Scanner;
class two_d_sum
{
static int i;
static void sum1(int arr[][], int row1 ,int column1)
{  
int sum=0;  

for(i = 0; i < row1; i++)
  {
 for(j = 0; j < column1; j++) 
  {

sum=sum+arr[i][j];
}
}
System.out.println("Sum of array is"+ " " +sum);
}


public static void main(String args[])  
    {
	int i, j;
	System.out.println("Enter total rows and columns: ");
	Scanner s = new Scanner(System.in);
	int row = s.nextInt();
	int column = s.nextInt();
	int array[][] = new int[row][column];
	System.out.println("Enter matrix:");
 	for(i = 0; i < row; i++)
  	{
   	    for(j = 0; j < column; j++) 
     	    {
        	array[i][j] = s.nextInt();
        	System.out.print(" ");
            }
  	}

  sum1(array,row,cloumn);
}
}

