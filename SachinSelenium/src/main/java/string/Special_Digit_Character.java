package string;

public class Special_Digit_Character 
{

	public static void main(String[] args) 
	{
		//String s1="SACHIN515443@#$@$^%&*&^%^$%$#$15552DADHE15454$##@$#!!$#@$%^";
		String s="I will eat 2 burgers 23 fries & 1.25 cokes l8r";
	
		String no=" ";
		String special=" ";
		String ch=" ";
		int count = 0;
		for(int i=0;i<=s.length()-1;i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				no=no+s.charAt(i);
				count++;
			}
			else if (Character.isAlphabetic(s.charAt(i)))
			{
				ch=ch+s.charAt(i);
			}
			else
			{
				special=special+s.charAt(i);
			}
			
		}
		System.out.println(no);
		System.out.println(special);
		System.out.println(ch);
		System.out.println(count-2);
	}

}
