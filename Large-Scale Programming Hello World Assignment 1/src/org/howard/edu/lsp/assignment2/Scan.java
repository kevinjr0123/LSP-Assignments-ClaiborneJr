
package org.howard.edu.lsp.assignment2;

import java.util.Scanner;

public class Scan {

	//sets sum value to 0 and product value to 1
	public static int sum = 0, product = 1;

	
	//method to type in numbers as input
		public static void main(String args[]) {

			Scanner sc = new Scanner(System.in);

			while(true) {

				System.out.println("String?");

				String input = sc.nextLine();

				if(input.equals("Goodbye"))

					break;

				else

					scanString(input);
				
				System.out.println("Tokens: " + "\n");
				
				System.out.println(input + "\n");
				
				System.out.println("Sum: " + sum + "\n");

				System.out.println("Product: " + product + "\n");
				

			}

		}
	
	//method to add and multiply numbers inputed
	public static void scanString(String input) {

		int number, index, beginIndex = 0;


		while(true) {

			index = input.indexOf(' ');

			if(index == -1)

				break;

			else {

				number = Integer.parseInt(input.substring(beginIndex, index));

				sum += number;

				product *= number;

				input = input.substring(index + 1, input.length());

			}

		}

		number = Integer.parseInt(input);

		sum += number;

		product *= number;

	}
	
}

