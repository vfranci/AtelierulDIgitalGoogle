package concurrency.RabbitRace;

public class RabbitThread extends Thread{
    private int nr;
    public RabbitThread(int nr){
        this.nr=nr;
    }

    @Override
    public void run(){
        //nr++;
        System.out.println("Rabbit #" + nr + " is running");
    }
}
