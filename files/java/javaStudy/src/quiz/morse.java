package quiz;

public class morse {

	public static void main(String[] args) {
		String letters = ".... . .-.. .-.. ---"; 
		String answer = "";
		String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","...."
						  ,"..",".---","-.-",".-..","--","-.","---",".--."
						  ,"--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		String[] alphabet = {"a","b","c","d","e","f","g","h","i","j",
							"k","l","m","n","o","p","q","r","s","t",
							"u","v","w","x","y","z"};
		String[] mLetters = letters.split(" ");
		for(int i=0;i<mLetters.length;i++) {
			for(int j=0;j<morse.length;j++) {
				if(mLetters[i].equals(morse[j])) {
					answer += alphabet[j];
				}
			}
		}
		System.out.println(answer);
	}

}
