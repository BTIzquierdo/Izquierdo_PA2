import java.util.Scanner;
public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		String[] topics = new String[5];
		int[][] responses = new int[5][10];
		int participants;
		int average = 0;
		int heighest = 0;
		String heighestTopic = "na";
		int lowest = 10;
		String lowestTopic = "na";
		
		topics[0] = "Hotdogs";
		topics[1] = "Hamburgers";
		topics[2] = "Fries";
		topics[3] = "Onion Rings";
		topics[4] = "Corndogs";
		
		System.out.println("How many people are taking this survey?: ");
		participants = scnr.nextInt();
		
		for (int i = 0; i < participants; i++)
		{
			System.out.print("Participant " + participants + 1 + ": ");
			for (int j = 0; j < 5; j++)
			{
				System.out.println("How would you rate " + topics[j] + "?");
				responses[i][j] = scnr.nextInt();
			};
		};
		for (int i = 0; i < 5; i++)
		{
			System.out.print(topics[i] + "  ");
			for(int j = 0; j < participants; j++)
			{
				average += responses[i][j];
				System.out.print(responses[i][j] + "  ");	
			};
			average /= participants;
			if (average < lowest)
			{
				lowest = average;
				lowestTopic = topics[i];
			}
			if (average > heighest)
			{
				heighest = average;
				heighestTopic = topics[i];
			}
			
			System.out.println("average: " + average + ".");
			average = 0;
		};
		System.out.println("Heighest rated topic: " + heighestTopic + " " + heighest);
		System.out.println("Lowest rated topic: " + lowestTopic + " " + lowest);

	}

}
