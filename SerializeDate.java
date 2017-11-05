import java.io.*;
import java.util.Date;
class SerializeDate
{
	Date d;
	public SerializeDate()
	{
		d = new Date();	
	}
	public void performSr()
	{
		try
		{
		FileOutputStream fs = new FileOutputStream("data.ser");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		os.writeObject(d);
		os.flush();
		os.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}