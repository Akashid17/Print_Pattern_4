
import java.lang.*;
import java.io.*;

class PatternX
{
	public void Display(int iNo)
	{
		if(iNo < 0)
		{
			iNo = -iNo;
		}

		do
		{
			System.out.print(iNo+"\t#\t");

			iNo--;
		} while(iNo != 0);
	}
}

class Main
{
	public static void main(String[] atgs) throws Exception
	{
		BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Number");
		int iValue = Integer.parseInt(bobj.readLine());

		PatternX pobj = new PatternX();
		pobj.Display(iValue);

		System.out.println();
	}
}