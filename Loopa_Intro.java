/*
 * This is a submission to the Loops Intro Practice Assignment 
 */
public class Loops_Intro_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * This is question one and it will calculate how much times the letter B was shown inside of the string
 */
		System.out.print(countLetters("bababababababbababababb", 'b'));
	}
	public static int countLetters(String str, char letter)
	{
		int count=0;
		for (int i=0; i<str.length(); i++)
		{
		if (str.charAt(i)==letter)
		{
			count++;
		}
}
return count;
	}
/*
 * Question 2 will give the factorial
 */
	public static int getFact(int n)
	{
		int prod = n;
		{
			prod = prod*(n-1);
			n--;
		}
		
		return prod;
	
}
	/*
	 * Question 3 will it will check it there is a double letter and if there is a double letter it is true if not it is false
	 */
	public static boolean checkRepeating(String str)
	{
		for (int i=0; i < str.length();i++)
		{
			for (int j=i; j < str.length();j++)
			{
				if(i == j)
				{
					
				}
				else if (str.charAt(i) == str.charAt(j))
				{
					return true;
				}
			}
		}
		return false;
	}
}
