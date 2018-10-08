import java.util.Arrays; 
import java.util.Scanner; 

public class kth_smallest{ 
 
public static int get(int[] b, int total,int k){  
Arrays.sort(b);  

for (int i = 0; i < b.length; i++) {
   System.out.println(b[i]);

  }
 
return b[k-1];  
}  
public static void main(String args[]){  
Scanner x=new Scanner(System.in);
System.out.println("	Enter  kth smallest you want    ");  

int k=x.nextInt();

int b[]={44,66,99,77,33,22,55};  

System.out.println("kth the smallest elemnent: "+get(b,7,k));  
}}  