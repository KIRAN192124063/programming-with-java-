import java.util.Scanner;

public class RectangleStar2 {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int rows, columns, i = 1, j;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter Number of Rows : ");
		rows = sc.nextInt();	
		
		System.out.print(" Please Enter Number of Columns : ");
		columns = sc.nextInt();		
			
		while(i <= rows)
		{
			j = 1;
			
			while(j <= columns)
			{
				System.out.print("*"); 
				j++;
			}
			i++;
			System.out.print("\n"); 
		}	
	}
}
