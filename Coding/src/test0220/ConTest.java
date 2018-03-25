package test0220;

public class ConTest {
    public ConTest dosth(int a){
        System.out.println(a);
        return new ConTest();
    }

}
class Tst extends ConTest{
    @Override
    public Tst dosth(int a) {
        Tst t=new Tst();
        return t;
    }

    public Tst clone(){
        Tst t= null;
        try {
            t = (Tst)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
 
        return t;
    }
}
