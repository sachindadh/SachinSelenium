package string;

public class Repeated_Pattern 
{

	public static void main(String[] args)
	{
		String s1="sasasasasasasfnfkgjbsancndsabcbsasabcdjsabcdjsa";
		int temp=0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			if (s1.charAt(i)=='s'&& s1.charAt(i+1)=='a')
				temp=temp+1;
			
	}
		System.out.println(temp);

}
	
}
