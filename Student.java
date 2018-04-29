class Student
{
	int studId = 100;
	
	public void study()
	{
		System.out.println("Student studies");
	}
	public void study(String bookName)
	{
		System.out.println("Student studies "+bookName);	
	}
	public void study(String bookName, String authorName)
	{
		System.out.println("Student studies "+bookName+ " authored by "+authorName);
	}
	public void study(int bookPrice)
	{
		System.out.println("Book Cost "+bookPrice);
	}
}