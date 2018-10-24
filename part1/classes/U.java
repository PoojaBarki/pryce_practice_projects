class U 
{
	public static void main(String[] args) 
	{
		int i=0;
		int j=i++ +i +i-- +i +i-- + i++ + i-- +i +i++ + i-- +i +i++;// 2,i=-1, || -2 i=-1 || -3,i=0
//         
		System.out.println(i);
		System.out.println(j);
	}
}