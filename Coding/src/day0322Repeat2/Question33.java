package day0322Repeat2;

public class Question33 {
    public static void main(String[] args) {
//        int[][] n = new int[10][21];
//        n[0][10] = 1;
//        for(int i=1;i<10;i++)
//            for(int j=10-i;j<10+i+1;j++)
//                n[i][j] = n[i-1][j-1]+n[i-1][j+1];
//        for(int i=0;i<10;i++){
//            for(int j=0;j<21;j++){
//                if(n[i][j]==0)
//                    System.out.print("   ");
//                else{
//                    if(n[i][j]<10)
//                        System.out.print("  "+n[i][j]);//空格为了美观需要
//                    else if(n[i][j]<100)
//                        System.out.print(" "+n[i][j]);
//                    else
//                        System.out.print(n[i][j]);
//                }
//            }
//            System.out.println();
//        }
        p(10);
    }

    public static void p(int n) {
        int a[][] = new int[n][2 * n - 1];
        a[0][9] = 1;
        for (int i = 1; i < a.length; i++) {
            a[i][n - i - 1] = 1;
            a[i][n + i - 1] = 1;
            for (int j = 1; j < a[0].length - 1; j++) {
                if (a[i - 1][j - 1] != 0 && a[i - 1][j + 1] != 0) {
                    a[i][j] = a[i - 1][j - 1] + a[i - 1][j + 1];
                    //System.out.print(a[i][j]);
                }
            }

        }
        for (int x = 0; x < a.length; x++) {
            for (int y = 0; y < a[0].length; y++) {
                if (a[x][y] == 0) {
                    System.out.print("   ");
                } else {
                    System.out.print("  " + a[x][y]);
                }

            }
            System.out.println();
        }
    }
}
