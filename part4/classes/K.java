class  K
{
	public static void main(String[] args) 
	{
		System.out.println("main end");
		int  i = test1();
		int j=i+test1();
		int k=i +test1() +j+test1();
		System.out.println("i = "+i);
		System.out.println("j = "+j);
		System.out.println("k = "+k);
		System.out.println(test1());
	
	}
		public static int test1() 
	{
		System.out.println(" fromtest");
		return 100;
		
	}
	

	}


 

