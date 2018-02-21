package test0220;

import java.util.Arrays;
import java.util.HashSet;

public class SingleNum {
    public  static  int single(int[] nums){

        Arrays.sort(nums);
        int a=nums[0];
        for(int i=1;i<nums.length-1;i++){

            if(i==nums.length-2&&nums[i]!=nums[i+1]){
                a=nums[nums.length-1];
            }
            if(nums[i]!=nums[i-1]&&nums[i]!=nums[i+1]){
                a=nums[i];
                break;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(single(new int[]{3}));
    }
}
