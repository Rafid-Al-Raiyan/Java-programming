import java.util.Scanner;
public class labdayone {

	public static void main(String[] args) {
		int num;
		
		Scanner sc= new Scanner(System.in);
		
		num= sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("This number is even");
		}
		else 
			System.out.println("This number is odd");
	}

}
