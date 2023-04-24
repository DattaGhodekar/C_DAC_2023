class Pattern5{
	public static void main(String[] arg)
	{
		for(int i=1; i<10; i=i+2)
		{
			for(int j=1; j<=((10-i)/2); j++)
			{
				System.out.print("  ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}