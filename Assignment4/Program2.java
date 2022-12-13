

public class Program2 {

	public static void main(String[] args) {
		
		
		String str="abcdadcb";
		String str1="";
		String duplicate="";
		for(int i=0;i<str.length();i++)
		{
			if(!str1.contains(Character.toString(str.charAt(i))))
			{
				str1=str1+str.charAt(i);
			}
			else
			{
				duplicate=duplicate+str.charAt(i);
			}
		}
		System.out.println(duplicate);

	}

}
