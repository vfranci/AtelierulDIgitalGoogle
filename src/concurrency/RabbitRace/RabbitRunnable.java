package concurrency.RabbitRace;

public class RabbitRunnable implements Runnable {
    private int nr;
    public RabbitRunnable(int nr){
        this.nr=nr;
    }

    @Override
    public void run(){
        //nr++
        System.out.println("Rabbit #" + nr);
    }
}
