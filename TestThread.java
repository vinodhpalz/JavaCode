class JobThread implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());		
	}
}
class TestThread
{
	public static void main(String[] args)
	{
		try
		{
		System.out.println("Main Thread Starts");
		JobThread jt = new JobThread();
		Thread t1 = new Thread(jt); //New State
		Thread t2 = new Thread(jt);
		t1.setName("Tom");
		t1.setPriority(10);
		t2.setName("Jerry");
		t2.setPriority(1);
		t1.start(); //Runnable
		t1.sleep(3000);
		t2.start();
		System.out.println("Main Thread Ends");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}