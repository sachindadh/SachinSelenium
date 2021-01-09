package string;

public class Split_Reverse_IMP {

	public static void main(String[] args) 
	{
		String s1="SARIKA SACHIN DADHE";
		String s2 [] =s1.split(" ");
		for(int i=0;i<=s2.length-1;i++)
			
		{
			if( i%2!=1) // to reverse only odd words
				
				//if(i%2==1)---use this for to reverse only even words
			{
				String s3=s2[i];
				
				String s4=" ";
				
				for(int j=s3.length()-1;j>=0;j--)
				{
					s4=s4+s3.charAt(j);
				}
				
				System.out.print(s4+" ");
			}
			
			else
			{
				System.out.print(s2[i]+ " ");
			}
			
		}
		
	}

}
