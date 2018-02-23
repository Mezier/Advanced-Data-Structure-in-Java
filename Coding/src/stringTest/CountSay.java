package stringTest;

//        1.     1
//        2.     11
//        3.     21
//        4.     1211
//        5.     111221
public class CountSay {
    public static String countAndSay(int n) {
        String s = "";
        if (n == 1) {
            s = "1";
        } else {
            s = cc(countAndSay(n - 1));
        }

        return s;
    }

    public static String cc(String str) {
        StringBuffer s = new StringBuffer();
        int i=0;
        while ( i < str.length()) {
            int num = 1;
            while (i + num < str.length() && Character.toString(str.charAt(i)).equals(Character.toString(str.charAt(i + num)))) {
                num++;
            }
            s.append(num);
            s.append(str.charAt(i));

            if (i + num == str.length()) {
                break;
            }
            i=i+num;
        }
        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(6));
    }
}
