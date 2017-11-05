import java.io.*;
import java.util.Date;
class DeSerializeDate
{
	Date d;
	public DeSerializeDate()
	{
		d = null;
	}
	public void performDeSr()
	{
		try
		{
		FileInputStream fs = new FileInputStream("data.ser");
		ObjectInputStream os = new ObjectInputStream(fs);
		d = (Date)os.readObject();
		os.close();
		System.out.println("Date is: "+d);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}