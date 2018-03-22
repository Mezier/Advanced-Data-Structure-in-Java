package day0322Repeat2;

public class Question19 {
    public static void diamond(int n){
        if(n%2==0) n=n-1;
        for(int i=1;i<=n/2+1;i++){  //row
           for(int j=1;j<=n;j++){   //column
               if(j<=(n-2*i+1)/2||j>(n+2*i-1)/2){
                   System.out.print(" ");
               }else{
                   System.out.print("*");
               }

           }
            System.out.println();
        }
        for(int i=1;i<=n/2;i++){
            for(int j=1;j<=n;j++){
                if(j<=i||j>n-i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        diamond(11);
    }
}
