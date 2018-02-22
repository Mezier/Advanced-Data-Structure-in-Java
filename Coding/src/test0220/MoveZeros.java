package test0220;

import java.util.Arrays;

//Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//        For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
public class MoveZeros {
    public static int[] method1(int[] nums){

        int index=0;
        int count=nums.length;
        int n=0;
        while(index<count){
            if(nums[index]==0){

                for(int j=index;j<nums.length-1;j++){
                    nums[j]=nums[j+1];

                }
                nums[nums.length-1-n]=0;
                n++;
                count--;
                continue;
            }
            index++;
        }
        return nums;
    }

    public static void main(String[] args) {
        int a[]=method1(new int[]{1,0,2,0,3,6});
        System.out.println(Arrays.toString(a));
    }
}
