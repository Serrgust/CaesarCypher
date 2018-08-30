
public class CaesarCypher {

	public int key;
	
	private final static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	private static String shiftedAlphabet;
	
	public  CaesarCypher(int key) {
		this.key = key;
		String leftSubstring = alphabet.substring(0,key);
		String rightSubstring = alphabet.substring(key);
		shiftedAlphabet = rightSubstring + leftSubstring;

	}
	
	public String encode (String clearText) {
		String cypheredText = "";
		for(int i=0; i<clearText.length(); i++) {
			cypheredText += shiftedAlphabet.charAt(alphabet.indexOf(clearText.charAt(i)));
		}
		return cypheredText;
	}

}
