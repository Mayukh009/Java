

public class Program7 {

	public static void main(String[] args) {
		
		
		String str="abcdadcb";
		String str1="";
		
		
		for(int i=0;i<str.length();i++)
		{
			if(!str1.contains(Character.toString(str.charAt(i))))
			{
				str1=str1+str.charAt(i);
			}
		}
		if(str.length()==str1.length())
		{
			System.out.println("String contains unique characters");
		}
		else
		{
			System.out.println("String not contains unique characters");
		}
		
		

	}

}
