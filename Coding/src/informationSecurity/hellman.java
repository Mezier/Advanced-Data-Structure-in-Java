package informationSecurity;

import java.util.HashSet;
import java.util.Set;

public class hellman {
    public static void generate(int n){
        for(int g=0;g<n;g++){
            Set set=new HashSet();
            for(int a=1;a<n;a++){
                int x= (int) (Math.pow(g,a)%n);
                set.add(x);
                System.out.print(x+" ");
            }
            if(set.size()==n-1){
                System.out.print("True"+g);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        generate(7);
    }
}
