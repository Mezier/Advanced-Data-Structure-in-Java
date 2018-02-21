package test0220;

import java.util.Arrays;

//Given an array of integers, find if the array contains any duplicates.
//        Your function should return true if any value appears at least twice in the array,
//        and it should return false if every element is distinct.
public class ContainDuplicate {
    public static boolean con(int[] nums){
        boolean f=false;
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
                if (nums[j]==nums[i]&&i!=j){
                    f=true;
                    break;
                }
            }
        }
        return f;
    }
    public static boolean method2(int[] nums){
        boolean f=false;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                f=true;
                break;
            }
        }
        return f;
    }
    public static void main(String[] args) {
        System.out.println(method2(new int[]{2,5,8,6,3,2}));
    }
}
