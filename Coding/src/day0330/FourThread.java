package day0330;

// design four thread, two of them increment 1 every time, two of them decrease j every time
public class FourThread {
    private int j;

    class Inc implements Runnable {
        public void run() {
            for (int i = 0; i < 10; i++) {
                inc();
            }
        }

    }

    class Dec implements Runnable {
        public void run() {
            for (int i = 0; i < 10; i++) {
                dec();
            }
        }
    }

    private synchronized void inc() {
        j++;
        System.out.println(Thread.currentThread().getName() + "-inc:" + j);
    }

    private synchronized void dec() {
        j--;
        System.out.println(Thread.currentThread().getName() + "-dec:" + j);
    }


    public static void main(String[] args) {
        FourThread f = new FourThread();
        Inc in = f.new Inc();
        Dec de = f.new Dec();
        for (int i = 0; i < 2; i++) {
            Thread t = new Thread(in);
            t.start();
            t = new Thread(de);
            t.start();
        }
    }
}

