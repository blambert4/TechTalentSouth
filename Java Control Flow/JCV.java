public class JCV {

//more efficient?
	static void banana() {
		String w = "*";
		for (byte i = 0; i < 5; i++) {
			System.out.println(w);
			w = w + "*";
		}
	}

//less efficient nested loop???
	

	
	public static void main(String[] args) {
		byte k = 80;
		byte j = 12;
		for (byte i = 0; i < 5; i++) {
			k = (byte)(k-j);
		}
		System.out.println(k);
		banana();

	}
}





// answer is 20
// cant think of a nested for loop example