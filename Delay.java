public class Delay implements Runnable {
    private int sec;
    public Delay(int sec) { this.sec = sec; }
    @Override
    public void run() throws InterruptedException {
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {return;}
    }
}
