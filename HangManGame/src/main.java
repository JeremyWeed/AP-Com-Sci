import java.util.*;

public class main {
	static Scanner stan = new Scanner(System.in);
	static String currentWord = "";
	static String word = "";
	static int strikes = 0;
	static String guesses = "";
	static boolean playagain = true;
	static int pos = 0;

	public static void main(String args[]) {
		main.start();

	}

	public static void start() {
		while (playagain) {
			currentWord = "";
			guesses = "";
			strikes = 0;
			System.out.println("Welcome to hangman");
			System.out
					.println("Guess one letter at a time to try to guess a word in under 7 tries");
			System.out.print("your word is ");
			word = Stuff.words[(int) (Math.random() * Stuff.words.length)];
			word = word.toLowerCase();

			for (int i = 0; i < word.length(); i++) {
				currentWord += "-";
			}
			System.out.println(currentWord);
			game();
			System.out.println("Do you want to play again? (true/false)");
			playagain = Boolean.parseBoolean(stan.next());
		}
	}

	public static void game() {
		while (!word.equals(currentWord) && strikes < Stuff.maxStrikes) {
			String s = stan.next();
			s = s.toLowerCase();
			word.indexOf(s);
			if (s.length() > 1) {
				System.out.println("ENTER ONE LETTER AT A TIME, GENIUS.");
			} else if (word.indexOf(s) != -1 && guesses.indexOf(s) == -1) {
				guesses += s;
				letter(s);
				System.out.println("Good job!");
			} else if (guesses.indexOf(s) != -1) {
				System.out.println("You already guessed that");
			} else {
				guesses += s;
				strikes++;
				System.out.println("Nope, not in the word");
			}
			Stuff.printMan(strikes);
			System.out.println(currentWord);
		}
		if (strikes == Stuff.maxStrikes) {
			System.out.println("You Lose, Loser");
		} else {
			System.out.println("You Win!");
		}
	}

	public static void letter(String s) {
		char[] c = s.toCharArray();
		char[] w = word.toCharArray();
		int i = 0;
		for (char x : w) {
			if (c[0] == x) {
				currentWord = currentWord.substring(0, i) + x
						+ currentWord.substring(i + 1);
			}
			
			i++;
		}
	}

}
