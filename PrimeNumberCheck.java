import java.util.Scanner;
public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prime;
		boolean flag = false;
		Scanner sc= new Scanner(System.in);
				prime= sc.nextInt();
				for(int i=2;i<=prime/2;i++)
				{
					if (prime%i==0)
					{
						System.out.println("The number is not prime!!");
						flag = true;
						break;
					}
				}
				if (flag==false)
					System.out.println("The number is prime!");
	}

}
