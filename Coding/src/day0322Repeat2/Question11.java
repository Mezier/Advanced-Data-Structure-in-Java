package day0322Repeat2;

public class Question11 {
    public static void main(String[] args) {
        for(int i=1;i<5;i++){
            for(int j=1;j<5;j++){
                if(i==j){
                    continue;
                }
                for(int k=1;k<5;k++){
                    if(k!=i&&k!=j){
                        System.out.println(i*100+j*10+k);
                    }
                }
            }
        }
    }
}
