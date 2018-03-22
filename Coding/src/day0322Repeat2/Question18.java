package day0322Repeat2;

import java.util.*;

//There's a competition between group1(a,b,c) and group2(x,y,z)'
//a said he don't want to compete with x
//c said he don't want to compete with x and z
//please get the two groups' opponent'
public class Question18 {
    public static void main(String[] args) {
        // Assuming the opponent of a is i,
        //the opponent of b is j
        //the opponent of c is k
        //for convenience, I use number to compare, finally replace the result in a char array
        char name[] = new char[]{'x', 'y', 'z'};
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                if (i != j) {
                    for (int k = 1; k < 4; k++) {
                        if (k != i && k != j) {
                            if ((i != 1 && k != 1 && k != 3)) {
                                System.out.println("a->" + name[i - 1] + " b->" + name[j - 1] + " c->" + name[k - 1]);
                            }
                        }
                    }
                }

            }
        }
    }
}
