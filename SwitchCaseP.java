public class SwitchCaseP
{	
	public static void main(String[] args)
	{
		// switch case works only for chat string and integer values

		int n = 3;

		// "break" keyword is used to break the execution of the switch case block 
		// and return out of the block.
		// string values is only supported in switch case 
		// with the jdk value of 1.7 or higher; better to check the support documentation
		switch(n)
		{
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		// the default block allows the condition 
		// when no case matches with the one we are checking
		default:
			System.out.println("No Match");
			break;
		}

		String a = "pqr";

		switch(a)
		{
		case "abc":
			System.out.println("one");
			break;
		case "pqr":
			System.out.println("two");
			break;
		}
	}
}