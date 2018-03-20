package day0320;

public class Inherientace {
    public static void main(String[] args) {
//        Father f=new Son();
//        //f.f1();
//        f.s();
//        System.out.println(f.a);
//        f.print();
        new RoundGlyph(5);
    }
}
class Father{
    int a=0;
    public void print(){
        System.out.println("father");
    }
    private void f1(){
        System.out.println("f1");
    }
    public void s(){
        System.out.println("s");
    }
}
class Son extends Father{
    int a=1;

    @Override
    public void print() {
        System.out.println("Son");
    }
    public void f1(){
        System.out.println("son f2");
    }
    public void f3(){
        System.out.println("f3");
    }

}
class Glyph {
    void draw() { System.out.println("Glyph.draw()"); }
    Glyph() {
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}
class RoundGlyph extends Glyph {
    private int radius = 1;
    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }
    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}
interface vv{
     void f();
     int a=1;
}