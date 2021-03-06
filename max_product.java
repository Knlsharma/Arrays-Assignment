import java.util.*; 
  
class max_product { 
      
    
    static void maxProduct(int arr[], int n) 
    { 
        if (n < 2) 
        { 
            System.out.println("No pairs exists"); 
            return; 
        } 
       
          int a = arr[0], b = arr[1]; 
       
        
        for (int i = 0; i < n; i++) 
          for (int j = i + 1; j < n; j++) 
             if (arr[i] * arr[j] > a * b){ 
                a = arr[i];  
                b = arr[j]; 
             } 
               
        System.out.println("Max product pair is {" + 
                           a + ", " + b + "}"); 
    } 
      
  
    public static void main(String[] args)  
    { 
        int arr[] = {-7,1, 4, 3, 6, 7, 0,-9,5}; 
        int n = arr.length; 
        maxProduct(arr, n); 
              
    } 
}