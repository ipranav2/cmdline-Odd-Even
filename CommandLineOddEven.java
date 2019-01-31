class CommandLineOddEven
{
	public static void main(String S[])
	{
		int even=0,odd=0;
		for(int i=0;i<S.length;i++)
		{
			int x = Integer.parseInt(S[i]);
			if(x%2==0)
			even++;
			else
			odd++;
		}
		System.out.println("number of even values= "+even);
		System.out.println("number of odd values= "+odd);
	}
}