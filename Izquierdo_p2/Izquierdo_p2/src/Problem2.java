import java.util.Scanner;
public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		System.out.println("Imperial or Metric?: ");
		String choice = scnr.next();
		double weight;
		double height;
		double BMI;
		if (choice == "Imperial")
		{
			System.out.println("What is your weight in pounds?: ");
			weight = scnr.nextDouble();
			System.out.println("What is your height in feet?: ");
			height = scnr.nextDouble();
			
			BMI = (703 * weight) / (height * height);
			
		}
		else
		{
			System.out.println("What is your weight in kilograms?: ");
			weight = scnr.nextDouble();
			System.out.println("What is your height in meters?: ");
			height = scnr.nextDouble();
			
			BMI = weight / (height * height); 
		}
		System.out.println("your BMI is: " + BMI);
		System.out.println("Underweight = < 18.5");
		System.out.println("Normal weight = 18.5 – 24.9");
		System.out.println("Overweight = 25 – 29.9");
		System.out.println("Obesity = 30 or greater");
	}

}
