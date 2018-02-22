package test0220;

import java.util.Arrays;

public class TwoSum {
    public static int[] method1(int[] nums,int target){
        int[] a=new int[2];
        for (int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target&&i!=j){
                    a[0]=i;
                    a[1]=j;
                    break;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a=method1(new int[]{2,7,11,88},9);
        System.out.println(Arrays.toString(a));
    }
}
