package day0322Repeat2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Question36 {
//    public static int[] move(int a[], int m) {
//        // ArrayList q= Arrays.asList(a);
//        for (int i = 0; i < a.length; i++) {
//            if (i < m) {
//                int temp = a[i];
//                a[i] = a[a.length - m + i];
//                a[a.length - m + i] = a[i + m];
//                a[i + m] = temp;
//            }
//        }
//        return a;
//
//    }

    public static int[] method2(int a[], int m) {
        int b[] = Arrays.copyOf(a, m + a.length);
        for (int i = 0; i < m; i++) {
            b[a.length + i] = b[i];
        }
        b = Arrays.copyOfRange(b, m, b.length);
        return b;
    }

    public static Queue<Integer> method3(int a[], int m) {
        Queue q = new LinkedList();
        for (int i = 0; i < a.length; i++) {
            q.add(a[i]);
        }
        for (int i = 0; i < m; i++) {
            q.add(q.remove());
        }
        return q;
    }

    public static void main(String[] args) {
        int a[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        //move(a,2);
        int[] c = method2(a, 3);
        System.out.println(Arrays.toString(c));
        Queue<Integer> q = method3(a, 3);
        System.out.println(q.toString());
    }
}
