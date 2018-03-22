package day0322Repeat2;

public class Question9 {
    public static int getSub(int n){
        int sum=1;
        for(int i=2;i<n;i++){
            if(n%i==0){
                sum+=i;
                n=n/i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
       for(int i=2;i<1000;i++){
           if(i==getSub(i)){
               System.out.println(i);
           }
       }
        int n = 10000;
        compNumber(n);

    }
    private static void compNumber(int n){
        int count = 0;
        System.out.println(n+"以内的完数：");
        for(int i=1;i<n+1;i++) {
            int sum = 0;
            for (int j = 1; j < i / 2 + 1; j++) {
                if ((i % j) == 0) {
                    sum += j;
                    if (sum == i) {
                        System.out.print(i + " ");
                        if ((count++) % 5 == 0)
                            System.out.println();
                    }
                }
            }
        }
    }}
