import java.util.Calendar;
import java.util.concurrent.TimeUnit;


public class Seconds implements Runnable {

    int hours=0, minutes=0, seconds=0;

    @Override
    public void run() {

        boolean finished = false;

        while (!Thread.currentThread().isInterrupted() && !finished) {

            //Se podria usar el dateformat, pero lo he usado asi por hacerlo de otra forma y no sea parecida a los ejemplos y ver si asi funciona de la misma manera.
            Calendar cal = Calendar.getInstance();
            hours = cal.get( Calendar.HOUR_OF_DAY );
            minutes = cal.get( Calendar.MINUTE );
            seconds = cal.get( Calendar.SECOND );

            System.out.printf("%d:%d:%d\n",hours, minutes, seconds);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("I was interrupted while I was sleeping");
                finished = true; //Si añado un return, no me saca el print ultimo, y con el isInterrupted no termina de ejecutar lo.
            }

        }

        System.out.println("I've been interrupted");


    }

}
