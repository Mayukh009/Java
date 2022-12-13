

public class Program4 {

	public static void main(String[] args) {
		
		
		String str="abcdadcb";
		int consonent=0;
		int vowel=0;
		int specialCharacter=0;
		
		
		
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			int s1=str.charAt(i);
			if(s1==97||s1==101||s1==105||s1==111||s1==117)
			{
				vowel=vowel+1;
			}
			else if(s1>=97 && s1<=122)
			{
				consonent=consonent+1;
			}
			else
			{
				specialCharacter=specialCharacter+1;
			}
		}
		
		
		
		System.out.println("Vowel "+vowel);
		System.out.println("Consonent "+consonent);
		System.out.println("SpecialCharacter "+specialCharacter);

	}

}
