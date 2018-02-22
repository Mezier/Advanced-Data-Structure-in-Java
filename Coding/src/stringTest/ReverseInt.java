package stringTest;

public class ReverseInt {
    public static int reverse(int x) {
        StringBuffer sb = new StringBuffer();
        int a = 0;
        if (x < 0) {
            x = -x;
            sb.append("-");
        }
        while (x > 9) {

            sb.append(x % 10);
            x = x / 10;
        }

        sb.append(x);
        try {
            a = Integer.valueOf(sb.toString());
        } catch (Exception e) {
            a = 0;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
}
