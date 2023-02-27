package edu.seminolestate.textanalyzer;
import java.util.Scanner;

//Trombo
//2/26/2023
public class TextAnalyzerApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String strUserInput = null;
		int intUserInput = 0;
		TextAnalyzer text = null;
		String[] midArr= new String[5];
		StringBuilder allText = new StringBuilder();
		int i=0;
		
		do {
		System.out.println("Enter your choice: ");
		System.out.println("1. Enter Text to Analyze");
		System.out.println("2. Display My Statistics");
		System.out.println("3. Display All Text");
		System.out.println("4. Exit");
		strUserInput = scanner.nextLine();
		intUserInput = Integer.parseInt(strUserInput);
		switch (intUserInput) {
	
		
		case 1:
		
		System.out.println("Enter your text: ");
		String textBlock = scanner.nextLine();
		
		
		text = new TextAnalyzer(textBlock);
		text.setTextBlock(textBlock);
		
			if(i<midArr.length) {
			allText.append(textBlock + " ");}
			else {
				System.out.println("The array is full.");
			}
			i++;
		break;
		case 2:
			//error message for no text added
		if(allText.length() < 1) {
			System.out.println("There is no text to analyze. "
					+ "Please Choose Option 1. ");
		}
		else {
			
		System.out.println("Number of Words: ");
		text.getTextBlock();
		displayInfo(text.getNumberOfWords());
		
		System.out.println("Number of Vowels: ");
		text.getTextBlock();
		displayInfo(text.getNumberOfVowels());
		
		System.out.println("Number of Consonants: ");
		text.getTextBlock();
		displayInfo(text.getNumberOfConsonants());
		}
		break;
		case 3:
		System.out.println("All text entered is: " + allText.toString());

		break;
		case 4:
		System.out.println("Thank you for using the Text Analyzer");
		scanner.close();
		break;
		default:
		System.out.println("Invalid menu option entered. Please try again.");
		}
		} while (intUserInput != 4);

	}
	public static void displayInfo(int display) {
		System.out.println(display);
				
	}

}
