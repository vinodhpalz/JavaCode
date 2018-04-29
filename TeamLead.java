class TeamLead extends Employee
{
	public void calcTax(int salary)
	{
		int tax = (salary / 10) * 3 - 500;
		System.out.println("Team lead tax is "+tax);
	}
}