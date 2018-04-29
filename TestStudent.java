class TestStudent
{
	public static void main(String[] args)
	{
		Student s1 = new Student();
		s1.study();
		s1.study("Harry Potter");
		s1.study("Harry Potter", "Rowling");
		s1.study(350);
			
		Student s2 = new Student();
		s2.study();
		s2.study("7 Habbits");
		
	}
}