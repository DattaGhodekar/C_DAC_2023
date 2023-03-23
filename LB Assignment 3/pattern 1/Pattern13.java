class Pattern13{
	public static void main(String[] arg)
	{
		for(int i=1; i<10; i++)
		{
			int con=(i<=5)?(6-i):(i-4);
			
			for(int j=1; j<=con; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}