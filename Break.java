public class Break
{
	public static void main(String[] args)
	throws java.io.IOException
	{
		char ch;
		for( ; ; )
		{
			ch = (char)System.in.read();
			if(ch == 'q')
				break;
		}
	}
}
