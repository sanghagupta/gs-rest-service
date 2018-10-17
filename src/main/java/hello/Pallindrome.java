package hello;


public class Pallindrome {

	private String word;
	private boolean pallindrom;
	private boolean anagramOfPallindrom;
	
	
	public String getWord() {
		return word;
	}


	public void setWord(String word) {
		this.word = word;
	}


	public boolean isPallindrom() {
		return pallindrom;
	}


	public void setPallindrom(boolean pallindrom) {
		this.pallindrom = pallindrom;
	}


	public boolean isAnagramOfPallindrom() {
		return anagramOfPallindrom;
	}


	public void setAnagramOfPallindrom(boolean anagramOfPallindrom) {
		this.anagramOfPallindrom = anagramOfPallindrom;
	}


	public Pallindrome(String word, boolean pallindrom, boolean anagramOfPallindrom) {
		// TODO Auto-generated constructor stub
		this.word=word;
		this.pallindrom=pallindrom;
		this.anagramOfPallindrom=anagramOfPallindrom;
	}

}
