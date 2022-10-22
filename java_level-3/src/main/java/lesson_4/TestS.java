package lesson_4;

public class TestS {

    public synchronized static void mstatic1(){
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public synchronized static void mstatic2(){
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class ThreadTestStatic{
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                TestS.mstatic1();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                TestS.mstatic2();
            }
        }).start();
    }
}
