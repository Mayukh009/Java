

public class Program1 {

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
		System.out.println(str1);
		

	}

}
