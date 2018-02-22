package stringTest;

//Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
public class Palindrome {
    public static boolean isPalindrome(String s) {
        boolean f = false;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {

            if (Character.isLetter(s.charAt(i))||(Character.isDigit(s.charAt(i)))) {
                sb.append(s.charAt(i));
            }
        }
        String sb2 = new String(sb.toString());
        sb.reverse();
        System.out.println(sb2);
        System.out.println(sb);
        if (sb.toString().equalsIgnoreCase(sb2.toString())) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("`l;`` 1o1 ??;l`"));
    }
}
