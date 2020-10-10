import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException{

        Thread thread = new Thread(new Seconds());
        thread.start();
        //Wait 12 seconds to interrupted the thread
        thread.join(12000);
        //Thread.sleep(12000); //Estuve probando con sleep al principio
        //TimeUnit.SECONDS.sleep(12); //Lo hice asi para probarlo, pero veo que con thread.join se hace mas optimo.
        //Interrupted the thread
        thread.interrupt();
        System.out.println("The thread is finished");


    }


}
