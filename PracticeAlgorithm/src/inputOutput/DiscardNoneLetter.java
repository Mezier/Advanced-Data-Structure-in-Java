package inputOutput;

import java.util.Scanner;

public class DiscardNoneLetter {
public static void main(String[] args) {
	String input = "1 fish 2 blue fish red fish blue fish";

	 // \\s* means 0 or more repetitions of any whitespace character 
	 // blue is the pattern to find
	 Scanner s = new Scanner(input).useDelimiter("\\s*blue\\s*");
	 System.out.println(s.next());   // prints: 1 fish 2
	 System.out.println(s.next());      // prints: fish red fish
	 System.out.println(s.next());      // prints: fish
	 s.close(); 
	 /*pattern:
	  * abcбн    Letters
	 123бн    Digits
	 \d      Any Digit
	 \D      Any Non-digit character
	 .       Any Character
	 \.      Period
	 [abc]   Only a, b, or c
	 [^abc]  Not a, b, nor c
	 [a-z]   Characters a to z
	 [0-9]   Numbers 0 to 9
	 \w      Any Alphanumeric character
	 \W      Any Non-alphanumeric character
	 {m}     m Repetitions
	 {m,n}   m to n Repetitions
	 *       Zero or more repetitions
	 +       One or more repetitions
	 ?       Optional character
	 \s      Any Whitespace
	 \S      Any Non-whitespace character
	 ^бн$     Starts and ends
	 (бн)     Capture Group
	 (a(bc)) Capture Sub-group
	 (.*)    Capture all
	 (ab|cd) Matches ab or cd*/
}
}
