class FixedStack
{
	private int pos;
	private int stk[];
	public FixedStack()
{
	stk=new int[4];
	pos=-1;
}
public int push(int data)
{
	if(pos<3)
{
	stk[++pos]=data;
	return 1;
}
return -1;
}
public int pop()
{
	if(pos>-1)
	{
		int data =stk[pos--];
		return 1;
	}
	return -1;
	}
	public static void main(String[] args)
	{

	}
}