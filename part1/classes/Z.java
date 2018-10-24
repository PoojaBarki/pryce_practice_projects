class Z 
{
	public static void main(String[] args) 
	{
		int i=-2;
		int j=--i +i++ +i;
         //      -3   -3  -2
		System.out.println(i);
		System.out.println(j);
	}
}
