import java.io.*;
class Employee implements Serializable
{
	public int empId;
	public transient int empAge;
	public Employee()
	{
		empId = 100;
		empAge = 35;	
	}		
}
class TestEmployee
{
	public static void main(String[] args)
	{
		Employee e = null;
		try
		{
		FileInputStream fs = new FileInputStream("Emp.ser");
		ObjectInputStream os = new ObjectInputStream(fs);
		e = (Employee)os.readObject();
		os.close();
		System.out.println("EmployeeInfo is: "+e.empId+" "+e.empAge);
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}

	}	
}




