class Pattern9{
	public static void main(String[] arg)
	{
		for(int i=1; i<10; i++)
		{
			int co=(i<=5)?(5-i):(i-5);
			for(int k=1; k<=co; k++)
			{
				System.out.print(" ");
			}
			
			int con=(i<=5)?(i):(10-i);
			for(int j=1; j<=con; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}