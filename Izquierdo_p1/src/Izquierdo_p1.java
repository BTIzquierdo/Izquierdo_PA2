import java.util.Scanner;
public class Izquierdo_p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	    System.out.println("Enter 4 digit number to be encrypted: ");
		Scanner scnr = new Scanner(System.in);
		int inputVal;
		int digit1;
		int digit2;
		int digit3;
		int digit4;
		int placeHolder;
		
		inputVal = scnr.nextInt();
		digit4 = inputVal % 10;
		digit3 = (inputVal / 10) % 10;
		digit2 = (inputVal / 100) % 10;
		digit1 = (inputVal / 1000) % 10;
		
		digit1 += 7;
		digit2 += 7;
		digit3 += 7;
		digit4 += 7;
		
		digit1 %= 10;
		digit2 %= 10;
		digit3 %= 10;
		digit4 %= 10;
		
		placeHolder = digit1;
		digit1 = digit3;
		digit3 = placeHolder;
		
		placeHolder = digit2;
		digit2 = digit4;
		digit4 = placeHolder;
		
		System.out.println(digit1 + "" + digit2 + "" + digit3 + "" + digit4);
		System.out.println( "enter 4 digit number to be Decrypted: ");
		
		inputVal = scnr.nextInt();
		digit4 = inputVal % 10;
		digit3 = (inputVal / 10) % 10;
		digit2 = (inputVal / 100) % 10;
		digit1 = (inputVal / 1000) % 10;
		
		placeHolder = digit4;
		digit4 = digit2;
		digit2 = placeHolder;
		
		placeHolder = digit1;
		digit1 = digit3;
		digit3 = placeHolder;
		
		digit1 = (digit1 + 10 - 7) % 10;
		digit2 = (digit2 + 10 - 7) % 10;
		digit3 = (digit3 + 10 - 7) % 10;
		digit4 = (digit4 + 10 - 7) % 10;
		System.out.println(digit1 + "" + digit2 + "" + digit3 + "" + digit4);
		

	}

}
