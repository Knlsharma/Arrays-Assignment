import java.util.Scanner;
public class diagonally
{
    public static void main(String args[])  
    {
	int i, j;
	System.out.println("Enter total rows and columns: ");
	Scanner s = new Scanner(System.in);
	int row = s.nextInt();
	int column = s.nextInt();
	int mat[][] = new int[row][column];
	System.out.println("Enter matrix:");
 	for(i = 0; i < row; i++)
  	{
   	    for(j = 0; j < column; j++) 
     	    {
        	mat[i][j] = s.nextInt();
        	System.out.print(" ");
            }
  	}
	System.out.println("The above matrix before Transpose is ");
  	for(i = 0; i < row; i++)
    	{
      	    for(j = 0; j < column; j++)
            {
          	System.out.print(mat[i][j]+" ");
            }
            System.out.println(" ");
        }
 	System.out.println("The above matrix after Transpose is ");


                  
int N=3;
                  
for (s=0; s<N; s++) {
    for (i=s; i>-1; i--) {
        System.out.print(mat[i][s-i] + " ");
    }
    System.out.println();
}
        
for (s=1; s<N; s++) {
    for (i=N-1; i>=s; i--) {
        System.out.print(mat[i][s+N-1-i] + " ");
    }
    System.out.println();
}

}
}
