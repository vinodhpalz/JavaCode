class Emp
{
	int salary = 50000;
	public int getSalary()
	{
		return salary;		
	}
	public String toString()
	{
		return "Employee Object";
	}
}

class TestEmpl
{
	public static void main(String[] args)
	{
		Emp e1 = new Emp();
		int sal = e1.getSalary();
		int tax = sal/10;
		System.out.println(tax);
	}
}