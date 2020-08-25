package iterations;
/*12345
2345
345
45
5
45
345
2345
12345*/
public class Pattern5 {

	public static void main(String[] args) {
		for(int row =1; row<=5;row++)
		{
			for(int col =row ;col<=5 ;col++)
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
		for(int row=4;row>=1;row--)
		{
			for(int col=row;col<=5;col++)
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

}
