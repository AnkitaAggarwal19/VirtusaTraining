class Static_test{
	static int a = 0, b = 0;
	
	//static
	{
		System.out.println("Static block executes first");
		a = 3;
		b = 10;
	}
	
	public int add()
	{
		return a + b;
	}
	
}

public class Static{
	public static void main(String arg[])
	{
		Static_test obj = new Static_test();
		int res = obj.add();
		System.out.println(res);
	}
}


