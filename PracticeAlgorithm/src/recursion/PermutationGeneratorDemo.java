package recursion;

import java.util.ArrayList;

// A permutation is a rearrangement of the letters
public class PermutationGeneratorDemo {
	public static ArrayList<String> getPermutations(String s) {
		ArrayList<String> permutations = new ArrayList<String>();
		// The empty string has a single permutation: itself
		if (s.length() <= 1) {
			permutations.add(s);
			return permutations;
		}
		// Loop through all character positions
		for (int i = 0; i < s.length(); i++) {
			// Form a simpler word by removing the character
			String shorterWord = s.substring(0, i) + s.substring(i + 1);
			// Generate all permutations of the simpler word
			ArrayList<String> shorterWordPermutations = getPermutations(shorterWord);
			// Add the removed character to the front of
			// each permutation of the simpler word,
			for (String a : shorterWordPermutations) {
				permutations.add(s.charAt(i) + a);
			}
		}
		// Return all permutations
		return permutations;
	}

	public static void main(String[] args) {
		ArrayList<String> ary = getPermutations("t");
		System.out.println(ary.size());
		for (int i = 0; i < ary.size(); i++) {
			System.out.println(ary.get(i));
		}
	}
}
