package string;

public class StringMethods 
{

	public static void main(String[] args) 
	{
		String s="SACHINdadhe";
		
		
		System.out.println(s.toLowerCase());
		
		System.out.println(s.length());
		
		System.out.println(s.substring(5));
		
		System.out.println(s.substring(2, 10));
		
		System.out.println(s.substring(5));
		
		System.out.println(s.indexOf('A'));
		
		System.out.println(s.lastIndexOf('a'));
		
		System.out.println(s.charAt(7));
		
		String s1="SACHINDADHE";
		
		System.out.println(s.equalsIgnoreCase(s1));
		
		System.out.println(s.contentEquals(s1));
		
		String s2="dadhe";
		
		System.out.println(s.contains(s2));
		
		System.out.println(s.concat(s1));
		
		System.out.println(s.startsWith("S"));
		
		System.out.println(s.endsWith("dhe"));
		
		System.out.println(s.replace("S", "s"));
		
		
		
		
		
	}

}
