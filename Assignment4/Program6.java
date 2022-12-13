

public class Program6 {

	public static void main(String[] args) {
		
		
		String str="abcdadcb";
		String str1="";
		str=str.toLowerCase();
		
		
		for(int i=0;i<str.length();i++)
		{
			if(!str1.contains(Character.toString(str.charAt(i))))
			{
				str1=str1+str.charAt(i);
			}
		}
		if(str1.length()==26)
		{
			System.out.println("Pangram");
		}
		else
		{
			System.out.println("Not Pangram");
		}
		

	}

}
