import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int n, i, j, num;
		boolean flag;
		n = input.nextInt();
		for(i = 0; i < n; i++) 
		{
			flag = false;
			num = input.nextInt();
			for(j = 2; j < (num-1); j++) if((num%j)==0) flag = true;
			if(flag) System.out.println("Not Prime");
			else System.out.println("Prime");
		}
		return;
	}
}
