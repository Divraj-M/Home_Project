import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class duplicates 
{
    public static void main(String[] args) 
    {
    	try
    	{
    		File file = new File("input1.txt");
    		Scanner s=new Scanner(file);
    		
    		int size=s.nextInt();
    		int nums[]=new int[size];
    		
    		for(int i=0;i<size;i++)
    		{
    			nums[i]=s.nextInt();
    		}
            System.out.print("Duplicate numbers: ");
            for (int i=0;i<nums.length;i++) {
                for (int j=i+1;j<nums.length;j++) {
                    if (nums[i]==nums[j]){
                        System.out.print(nums[i]+" ");
                        break;
                    }
                }
          }
    	}
    	catch(FileNotFoundException e)
    	{
    		System.out.println("File:error found");
    		e.printStackTrace();
    	}
    }
}
