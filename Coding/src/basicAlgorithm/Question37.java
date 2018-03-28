package basicAlgorithm;

import java.util.LinkedList;
import java.util.Queue;

public class Question37 {
    public static int game(int n){
        int a=0;
        Queue q=new LinkedList<>();
        for(int i=1;i<=n;i++){
            q.add(i);
        }
        int i=0;
        while(q.size()>1){
            i++;
            if(i%3==0){
                q.remove();
            }else{
                q.add(q.remove());
            }

        }
        a=(int)q.element();
        return a;
    }

    public static void main(String[] args) {
        System.out.println(game(8));
    }
}
