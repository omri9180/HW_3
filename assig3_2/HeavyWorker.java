package assig3_2;

public class HeavyWorker {

    private MySemaphore s1 = new MySemaphore(0);
    private MySemaphore s2 = new MySemaphore(0);
    private MySemaphore s3 = new MySemaphore(0);


    public void section1() {
        System.out.println(Thread.currentThread().getName() + " is in section1");
        try {
            /* sleep to simulate some work... */
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        System.out.println(Thread.currentThread().getName() + " leaving section1");
    }

    public void section2() {
        System.out.println(Thread.currentThread().getName() + " is in section2");
        try {
            /* sleep to simulate some work... */
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        System.out.println(Thread.currentThread().getName() + " leaving section2");
    }

    public void workA() {
        System.out.println(Thread.currentThread().getName() + " doing workA");

        s1.up();
        section1();
        s1.down();
        s2.up();
        section1();
        section2();
        s2.down();
        s3.up();
        section1();
        s3.up();
        s3.up();

    }

    public void workB() {
        s3.down();
        s3.down();
        s3.up();
            System.out.println(Thread.currentThread().getName() + " doing workB");


    }
}


