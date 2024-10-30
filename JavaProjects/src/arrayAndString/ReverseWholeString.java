package arrayAndString;

public class ReverseWholeString {
	
	public static String stringReversed(String forward) {
		String reversed = new StringBuilder(forward).reverse().toString();
		
		String result = reversed;
		System.out.println("Input backs is: " + result);
		return result;
	}
	
	public static String reverseByWord(String forward) {
		
		String[] words = forward.split(" ");
		StringBuilder backwardsWord = new StringBuilder();
		
		for(int i = words.length -1; i>=0; i--) {
			backwardsWord.append(words[i]);
			
			if(i !=0) {
				backwardsWord.append(" ");
			}
		}	
		
		String result = backwardsWord.toString();
		System.out.println("Input backwards by word is: " + result);
		return result;
	}
	
	public static String reverseBySentence(String forward) {
		String[] sentence = forward.split("\\.");
		StringBuilder backwardsSentence = new StringBuilder();
		
		for(int i = sentence.length-1; i>=0; i--) {
			backwardsSentence.append(sentence[i]);
			
			if(i != 0) {
				backwardsSentence.append(". ");
			}
		}
		String result = backwardsSentence.toString();
		System.out.println("Input backwards by sentence is: " + result);
		return result;
	}
	
	public static void main(String []args, String forward) {
			
			forward = "It matters not how straight the gate how charged with punishments the scroll. I am the master of my fate I am the captain of my soul"; 
			
			System.out.println("The string in it's original state is: \n" + forward);
			
			stringReversed(forward);
			reverseByWord(forward);
			reverseBySentence(forward);
	}		

}
