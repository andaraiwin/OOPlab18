public class Timer implements Runnable {
    @Override
    public void run() throws InterruptedException {
        for (int i = 0; true; i++) {
            System.out.println(i);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("interrupted!");
                return;
            }
        }
    }
}
