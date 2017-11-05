class TestCalc
{
	public void check(int a, int b)throws UserExp
	{
		if(a>b)
		{
			System.out.println("A is Greater");
		}
		else
		{
			throw new UserExp("The input for b should be lesser than a");
			;
		}
	}	
}