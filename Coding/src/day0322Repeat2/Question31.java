package day0322Repeat2;

public class Question31 {
    public static int[] rev(int[] array){

        for(int i=0;i<array.length/2;i++){
            int temp=array[i];
            array[i]=array[array.length-i-1];
            array[array.length-i-1]=temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array=new int[]{2,3,6,9,7};
        int[] b=rev(array);
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}
