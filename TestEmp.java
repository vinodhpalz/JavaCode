class TestEmp
{
	public static void main(String[] args)
	{
		Employee m1 = new Employee();
		if(m1 instanceof Manager)
		{
			System.out.println("Manager works");
			m1.calcTax(30000);
		}
		else if(m1 instanceof TeamLead)
		{
			System.out.println("TeamLead works");
			m1.calcTax(10000);
		}
		else
		{
			System.out.println("Employee works");
			m1.calcTax(50000);
		}
		
	}
}