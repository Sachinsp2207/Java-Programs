package arrays;

class OctToDec
{
	public static void main(String[] args)
	{
		
		int a[]= {1,7,3,5};
		int oct=0;
		int raise=0;
		for (int i = a.length-1; i>=0; i--) 
	{
			oct=oct+(a[i]*(int)(Math.pow(8,raise)));
			raise++;
	}
		System.out.println(oct);
	}

}
