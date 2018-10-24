class  J
{
	public static void main(String[] args) 
	{
		System.out.println("main end");
		int  i = test1();
		int j=i+test1();
		System.out.println("i = "+i);
		System.out.println("j = "+j);
	
	}
		public static int test1() 
	{
		System.out.println(" fromtest");
		return 100;
		
	}
	

	}


