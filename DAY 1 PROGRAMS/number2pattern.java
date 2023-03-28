import java.util.Scanner;
 
public class MainClass
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        //Taking rows value from the user
         
        System.out.println("How many rows you want in this pattern?");
         
        int rows = sc.nextInt();
         
        System.out.println("Here is your pattern....!!!");
         for(int i=1 ; i <= rows ; i++)  
        {
            System.out.print(i + " ");
            int n = i;
            for(int j = 1; j < i ; j++)
            {
                if(j%2 != 0)
                {
                    System.out.print((n + ((2 * (rows + 1 - i)) - 1)) + " ");
                    n = n + ((2 * (rows + 1 - i)) - 1);
                }
                else
                {
                    System.out.print((n + 2 * (i - j)) + " ");
                    n = n + 2 * (i - j);
                }
            }
            System.out.println();
        }
    
         
        //Close the resources
         
        sc.close();
    }
}
