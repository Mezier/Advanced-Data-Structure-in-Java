package test0220;

import java.util.Arrays;

public class RotateArray {
    public static void method1(int[] nums,int k){
        int b[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i<k) {
                b[i] = nums[nums.length - k+i];
            }else{
                b[i]=nums[(k+i+1)%nums.length];
            }
        }
        System.out.println(Arrays.toString(b));
    }
    public static void method2(int[] nums,int k){
       // int b[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i<k) {
                int temp=nums[i];
                nums[i] = nums[nums.length - k+i];
                nums[(k+i)%nums.length]=temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        method2(new int[]{1,2,3,4,5,6,7},3);
    }
}
