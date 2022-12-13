

public class Program8 {

	public static void main(String[] args) {
		
		
		String str="abcdadcb";
		int [] arr=new int[256];
		
		
		
		
		int max=0;
		char str1=0;
		for(int i=0;i<str.length();i++)
		{
			arr[str.charAt(i)]=arr[str.charAt(i)]+1;
		}
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]>=max)
			{
				max=arr[j];
				str1=(char) j;
				
			}
		}
		System.out.println(str1);
		
		
		

	}

}
