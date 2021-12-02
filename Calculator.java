import java.util.*;

public class Calculator 
{
	public static void main(String[] args) 
	{
		int selection;
		double a, b;
		Calculations x = new Calculations();
		Scanner scan = new Scanner(System.in);
		
		while (true)
		{
			System.out.println("1. Add 2 numbers.");
			System.out.println("2. Subtract a number from another number.");
			System.out.println("3. Mulitply 2 numbers.");
			System.out.println("4. Divide a number by another number.");
			System.out.println("5. Exit the program.");
			System.out.print("Please select the operation you'd like to perform: ");
			selection = scan.nextInt();
			
			switch (selection)
			{
				case 1:
				{
					System.out.println("\nAddition:");
					System.out.print("Enter your first value: ");
					a = scan.nextDouble();
					System.out.print("Enter your second value: ");
					b = scan.nextDouble();
					System.out.println(a + " + " + b +" = " + x.add(a, b) + "\n");
					break;
				}
				case 2:
				{
					System.out.println("\nSubtraction:");
					System.out.print("Enter your first value: ");
					a = scan.nextDouble();
					System.out.print("Enter your second value: ");
					b = scan.nextDouble();
					System.out.println(a + " - " + b +" = " + x.sub(a, b) + "\n");
					break;
				}
				case 3:
				{
					System.out.println("\nMultiplication:");
					System.out.print("Enter your first value: ");
					a = scan.nextDouble();
					System.out.print("Enter your second value: ");
					b = scan.nextDouble();
					System.out.println(a + " x " + b +" = " + x.multiply(a, b) + "\n");
					break;
				}
				case 4:
				{
					System.out.println("\nDivision");
					System.out.print("Enter your first value: ");
					a = scan.nextDouble();
					System.out.print("Enter your second value: ");
					b = scan.nextDouble();
					System.out.println(a + " / " + b +" = " + x.division(a, b) + "\n");
					break;
				}
				case 5:
				{
					
				}
				default:
				{
					
				}
			}
		}
	}
}
