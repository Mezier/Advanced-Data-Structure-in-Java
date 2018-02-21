package test0220;

import java.util.Arrays;
import java.util.LinkedList;

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
        LinkedList<Integer> list=new LinkedList<Integer>();
        for(int i=nums.length-k;i<nums.length;i++){
            list.add(nums[i]);
        }
        for(int i=0;i<nums.length-k;i++){
            list.add(nums[i]);
        }
        System.out.println(list.toString());
    }
    public static void method3(int[] nums,int k){
        int b[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            b[(i+k)%nums.length]=nums[i];
        }
        System.out.println(Arrays.toString(b));
    }
    public static void main(String[] args) {
        method3(new int[]{1,2,3,4,5,6,7},3);
    }
}
