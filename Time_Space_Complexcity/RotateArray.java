//You have been given a random integer array/list(ARR) of size N. Write a function that rotates the given array/list by D elements(towards the left).

//Functional Code

public class Solution {  

    public static void rotate(int[] arr, int d) {
    	int i=0;
        int n=arr.length;
        
        int shivam[]=new int[n];
        
        for(int m=0;m<n;m++)
        shivam[m]=arr[m];
        
        
        for(i=d;i<n;i++)
        {
            int temp=arr[i];
            arr[i]=arr[i-d];
            arr[i-d]=temp;
        }
    
     for(i=0;i<d;i++)
     {
         int temp=shivam[i];
         arr[n-d+i]=temp;
     }
    
    }
}

// Main code
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0) {
            return input;
        }
        
        String[] strNums; 
        strNums = br.readLine().split("\\s");
        

        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }

        return input;
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[] input = takeInput();
            int d = Integer.parseInt(br.readLine().trim());
            Solution.rotate(input, d);
            printArray(input);

            t -= 1;
        }
    }
}