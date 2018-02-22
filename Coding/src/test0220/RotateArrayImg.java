package test0220;

import java.util.ArrayList;
import java.util.Arrays;

//You are given an n x n 2D matrix representing an image.
//Rotate the image by 90 degrees (clockwise).
public class RotateArrayImg {
    public static void rotate(int[][] matrix) {
        for(int i = 0; i<matrix.length; i++){
            for(int j = i; j<matrix[0].length; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i =0 ; i<matrix.length; i++){
            for(int j = 0; j<matrix.length/2; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }

    }

    public static void main(String[] args) {
        int[][] a=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        rotate(a);
        System.out.println(Arrays.toString(a[0]));
        System.out.println(Arrays.toString(a[1]));

        System.out.println(Arrays.toString(a[2
                ]));

    }
}
