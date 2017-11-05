import java.util.regex.*;
class TestRegEx
{
	public static void main(String[] args)
	{
		String input = "9000123456";
		String regexe = "[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]";
		Pattern pattern = Pattern.compile(regexe);
		Matcher matcher = pattern.matcher(input);
		if(matcher.matches())
		{
			System.out.println("Match Found");
		}
		else
		{
			System.out.println("Match Not Found");
		}
	}
}