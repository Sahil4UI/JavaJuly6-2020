
import java.util.Scanner;
public class switchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Day NUmber :");
		int day = sc.nextInt();
		sc.close();
		
		switch(day)
		{
		case 1:
			System.out.println("Monday");
			break;
//			break - > break is used to exit out
			
		case 2:
			System.out.println("Tuesday");
			break;
			
			
		case 3:
			System.out.println("Wednesday");
			break;
			
			
			
		case 4:
			System.out.println("Thursday");
			break;
			
			
		case 5:
			System.out.println("Friday");
			break;
			
			
		case 6:
			System.out.println("Saturday");
			break;
			
			
		case 7:
			System.out.println("Sunday");
			break;
			
		default:
			System.out.println("Invalid Input");
			
		}
	}
}
