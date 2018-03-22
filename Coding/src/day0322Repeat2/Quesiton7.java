package day0322Repeat2;

public class Quesiton7 {
    public static void count(String s) {
        int number = 0;
        int letter = 0;
        int space = 0;
        int other = 0;
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (Character.isDigit(c)) {
                number++;
            } else if (Character.isLetter(c)) {
                letter++;
            } else if (Character.isSpaceChar(c)) {
                space++;
            } else {
                other++;
            }
        }
        System.out.println("number" + number + "   letter:" + letter + "   space" + space + "   other:" + other);
    }

    public static void main(String[] args) {
        String s = "789gdfd fdfd 4 4$%^ff ";
        System.out.println(s.length());
        count(s);
    }
}
