import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Largest Element in Array
//Given an array A[] of size n. The task is to find the largest element in it.
class Compute {
    
    public int largest(int arr[], int n)
    {
        int temp=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>temp){
                temp=arr[i];
            }
        }
        return temp;
        
    }
}
public class Q1 {
   public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Compute obj = new Compute();
            System.out.println(obj.largest(a, n));
            
        }
	}
}

// MAIN CODE
