class Pattern1
{
	public static void main(String args[])
	{	
		int c = 1;
		for(int i = 0;i<3;i++)
		{
			for(int j = 1;j<=(2*i)+1;j++)
			{
				System.out.print(c);
				c++;
			}
			System.out.println();
		}
	}
}