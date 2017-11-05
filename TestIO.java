//Read Input from a Console and Write Output to a console
//Read Input from a File and Write Output to a console
//Read Input from a Console and Write Output to a File
//Read Input from a File and Write Output to a File

//Byte Stream vs Char Stream

//Byte Stream - Stream
//Char Stream - Reader or Writer

import java.io.*;
class TestIO
{
	public static void main(String[] args)
	{
		try
		{
			FileReader fr = new FileReader("abc.txt");
			BufferedReader br = new BufferedReader(fr);
			
			FileWriter fw = new FileWriter("ddd.txt");
			PrintWriter o = new PrintWriter(fw);		

			String s1 = br.readLine();
			while(s1 != null)
			{	
				o.println(s1);
				s1 = br.readLine();
			}
				o.flush();
				o.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}