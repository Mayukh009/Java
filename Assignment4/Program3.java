

public class Program3 {

	public static void main(String[] args) {
	
		
		String str="2552";
		String str1="";
		
		
		for(int i=str.length()-1;i>=0;i--)
		{
			str1=str1+str.charAt(i);
		}
		
		if(str.equals(str1))
		{
			System.out.println("2552 is Palindrome");
		}
		else
		{
			System.out.println("2552 is not Palindrome");
		}

	}

}
