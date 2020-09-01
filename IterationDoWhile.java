public class IterationDoWhile
{
	public static void main(String[] args)
	{
		int i=9;//initialisation(the code is writen such that the condition is false even on the first execution but still the loop will be executed at least once)
		do
		{
			System.out.println("Hello");
			i++;//increment
		}while(i<=5);//condition is checked after the loop is executed atleast once
	}
}