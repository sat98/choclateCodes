public class ShiftOperator
{
	public static void main(String[] args)
	{
		int a = 8; // 1 0 0 0

		int b = a << 2; // 1 0 0 0 0 0 -> 32

		System.out.println(b);

		int c = 25; // 1 1 0 0 1

		int d = c >> 2; // 1 1 0 -> 6

		System.out.println(d);


	}
}