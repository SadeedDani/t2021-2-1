
import java.util.Scanner;
class Calculator{
	void calc(double n1,double n2,char operator) {
		double res;
		switch(operator) {
			case '+':
				res=n1 + n2;
				System.out.println("Result"+res);
				break;
			
			case '-':
			res=n1 - n2;
			System.out.println("Result "+res);
			break;
			
		case '*':
			res=n1 * n2;
			System.out.println("Result "+res);
			break;
		case '/':
			if(n2!=0) {
				res=n1/ n2;
				System.out.println("Result "+res);
			}else {
				System.out.println("Divisible by 0 is not allowd");
			}
			break;
			
		default:
			System.out.println("Invalid operator");
		}
		
	}
	
	
	
}

public class Program1 {

	public static void main(String[] args) {
		
		Calculator cl=new Calculator();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first number:");
		double n1=sc.nextInt();
		System.out.println("Enter a second number:");
		double n2=sc.nextInt();
		System.out.println("Enter the operator (+, -, *, /): ");
		char operator=sc.next().charAt(0);
		cl.calc(n1, n2, operator);
		
		

	}

}
