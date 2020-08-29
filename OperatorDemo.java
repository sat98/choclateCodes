public class OperatorDemo
{
	/*
	*
	*
	*
	* Arithmetic +,-,*,/,%
	* Bitwise
	* Relational
	* Logical
	*
	*
	*/
	public static void main(String[] args)
	{
		int m=6,n=4;
		int r1=m+n; //8
		int r2=m-n; //4
		int r3=m*n; //12
		double r4=(double)m/n; //3
		int r5=m%n; //2

		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);

		int a=4;
		int b=5;
		a+=b;//n=n+m;

		System.out.println(a);

//		++n; // pre increment
//		n++; // post increment

		m=++n;
		System.out.println(m);
		m=6; n=4;
		m=n++;
		System.out.println(m);


	}
}