import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class MinMax {
    public static void main(String[] args) {
    	File file= new File("input.txt");
    	Scanner s = new Scanner(file);
    	int size=s.nextInt();
    	int arr[] = new int[size];
    	
    	for(int i=0;i<size;i++)
    	{
    		arr[i]=s.nextInt();
    	}
    	
        
        int max = arr[0];
        int min = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
