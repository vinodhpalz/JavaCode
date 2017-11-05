//Regular Expression
//Pattern and Matcher
import java.util.regex.*;
class TestRegExp
{
	public static void main(String[] args)
	{
		String input = "a000012345";
		String regex = "[a-z][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
		
		if(m.matches())
		{
			System.out.println("Mobile number validation is success");
		}
		else
		{
			System.out.println("Mobile number validation is failure");
		
		}
	}
}