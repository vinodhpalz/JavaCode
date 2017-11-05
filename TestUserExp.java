class TestUserExp
{
	public static void main(String[] args)
	{
		try
		{
			TestCalc tc = new TestCalc();
			tc.check(10,5);
		}
		catch(Exception ue)
		{
			ue.printStackTrace();
		}
	}
}