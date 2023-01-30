import java.util.Hashtable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LearnSync {
    static Hashtable<Integer, String> hashtable = new Hashtable<>();
    static int a = 0;

    static synchronized void putSync(Integer k, String v){
        hashtable.put(k,v);
        System.out.println(Thread.currentThread());
    }

    public static void main(String[] args) throws InterruptedException {


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1 runnning");
                for (int i = 0; i < 1000; i++) {
                    putSync(1, "a");
                }

            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 2 runnning");
                for (int i = 0; i < 1000; i++) {
                    putSync(2, "b");
                }

            }
        });
        thread1.start();
        thread2.start();
        System.out.println(hashtable);
    }

    class MyExecService{
        public static void main(String[] args) {
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            executorService.execute(new Task2());
            executorService.execute(new Task2());
            executorService.shutdown();
        }

    }
}


