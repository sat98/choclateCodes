public class FirstCode
{
	public static void main(String args[])
	{
		System.out.println("Hello World");
		int i=5;// 4 byte = 32 bits
		short s=5;// 2 byte = 16 bits
		byte b=5;// 1 byte = 8 bits
		long l=500000000l; // 8 byte
		float f= 5.5f;
		double d=5.5;

		char c='A';
		c=66;// American Standard code for information interchange
		System.out.println(c);

		double d1=5;//implicit conversion
		int k = (int)5.6;//type casting, expkicit conversion
		System.out.println(k);

	}
}