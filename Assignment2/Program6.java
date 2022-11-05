
public class Program6 {

	public static void main(String[] args) {
		
		
		
		int [] arr= {1,2,3,4,5,6};
		int [] arr1= {1,2,4};
		
		
		boolean subArray=true;
		
	    for(int i=0;i<arr1.length;i++)
	    {
	    	for(int j=0;j<arr.length;j++)
	    	{
	    		if(arr1[i]==arr[j])
	    		{
	    			break;
	    		}
	    		if(j==arr.length-1)
		    	{
		    		subArray=false;
		    	}
	    	}
	    	
	    }
	    if(subArray)
	    {
	    	System.out.println("Subarray");
	    }
	    else
	    {
	    	System.out.println("Not Subarray");
	    }
	    

	}

}
