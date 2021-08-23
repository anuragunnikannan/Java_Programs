class Pattern3
{
	public static void main(String args[])
	{
		int c = 7;
		for(int i = 1;i<=4;i++)
		{
			for(int j = 1;j<=c;j++)
			{
				if(j==i || j==c)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print(" ");
				}
			}
			c--;
			System.out.println();
		}
	}
}	