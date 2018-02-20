package test0220;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicate {

    public static int removeDup(int[] nums){
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        System.out.println(Arrays.toString(nums));
        return i + 1;
    }

    public static void main(String[] args) {
        int[] a=new int[]{1,1,2};
        System.out.println(removeDup(a));

    }
}
