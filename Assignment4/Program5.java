import java.util.Arrays;

public class Program5 {

	public static void main(String[] args) {
		
		
		String str="abcdadcb";
		String str1="abcdadcb";
		char [] arr=str.toCharArray();
		char [] arr1=str1.toCharArray();
		Arrays.sort(arr);
		Arrays.sort(arr1);
		
		
		
		if(Arrays.equals(arr,arr1))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
		

	}

}
