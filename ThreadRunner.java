
public class ThreadRunner {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExecOne());
        Thread t2 = new Thread(new ExecTwo());

        t1.start();
        t2.start();

        new Thread(new Timer()).start();

        Thread d = new Thread(new Delay(5));
        d.start();
        System.out.println("joining a thread");
        try { d.join(); }
        catch (InterruptedException e) { return; }
        System.out.println("the wait is over");
    }
}
