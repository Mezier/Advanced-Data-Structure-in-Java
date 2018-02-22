package test0220;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.Arrays;

//Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
//        You may assume the integer do not contain any leading zero, except the number 0 itself.
public class PlusOne {
    public static int[] plusOneuos(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if (digits[0] == 0) {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            return res;
        }
        return digits;
    }

    public static int[] method2(int[] digits) {
        for(int i=digits.length-1;i>0;i--){
            if(digits[i]==9){
                digits[i]=0;
            }else{
                digits[i]++;
                break;
            }
        }
        if(digits[0]==0){
            int r[]=new int[digits.length+1];
            r[0]=1;
            return r;
        }
        return digits;
    }

    public static void main(String[] args) {
        int a[] = method2(new int[]{1, 0, 9});

        System.out.println((Arrays.toString(a)));
        int b[]=new int[8];
        b[0]=2;
        System.out.println(Arrays.toString(b));
    }
}
