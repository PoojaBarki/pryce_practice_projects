class C
{
	public static void main(String[] args) 
	{
		int i=0;
		int j=--i + i + --i + i + --i + i;
		//  -1      -2   -3  -4   -5    -6
		System.out.println(i);
	
		System.out.println(j);
	}
}
