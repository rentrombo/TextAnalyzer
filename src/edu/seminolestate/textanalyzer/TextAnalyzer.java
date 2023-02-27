package edu.seminolestate.textanalyzer;
//Trombo
//02/24/23
public class TextAnalyzer {
	
	private String textBlock;
	
	public static final String DEFAULT_TEXT_BLOCK = "no text";
//parameters
public TextAnalyzer(String newText) {
 this.textBlock = DEFAULT_TEXT_BLOCK;
}
public TextAnalyzer() {
	this(DEFAULT_TEXT_BLOCK);
}


//getters and setters
public int getNumberOfConsonants() {
	
	String textLower = textBlock.toLowerCase();
	int consCount = 0;
	for(int i=0;i<textLower.length();i++) {
				if(textLower.charAt(i) == 'a' 
				|| textLower.charAt(i) == 'e' 
				|| textLower.charAt(i) == 'i'
				|| textLower.charAt(i) == 'o'
				|| textLower.charAt(i) == 'u'
				|| textLower.charAt(i) == ' ') {
				}
				else {consCount++;}
	}return consCount;
}

public int getNumberOfVowels() {
	int vowelCount = 0;
	String textLower = textBlock.toLowerCase();
	for(int i=0;i<textLower.length();i++) {
				if(textLower.charAt(i) == 'a' 
				|| textLower.charAt(i) == 'e' 
				|| textLower.charAt(i) == 'i'
				|| textLower.charAt(i) == 'o'
				|| textLower.charAt(i) == 'u') {
					vowelCount++;
				}
	}return vowelCount;
}
public int getNumberOfWords() {
			if(textBlock == null || textBlock.isEmpty()) {
				return 0;}
			String[] wordCount = textBlock.split("\\s+");
			return wordCount.length;
}
;public String getTextBlock() {
	return textBlock;
}
public void setTextBlock(String newText ) {
	if(newText != null && newText.length() > 0) {
		this.textBlock = newText;
}

}
}

