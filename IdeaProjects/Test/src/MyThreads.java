import static java.lang.Thread.sleep;

public class MyThreads {
    public static void main(String[] args) throws InterruptedException {
        Task1 task1 = new Task1(); //NEW
        //task1.run();
        task1.start();

        task1.join();
        Task2 task2 = new Task2(); //NEW
        Thread task2Thread = new Thread(task2);
        task2Thread.setPriority(1);
        task2Thread.start();

        Thread task3Thread = new Thread(() -> {


            try {
                sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            finally {
                System.out.println("Thread 3");
                Thread.yield();
            }
        });
        task3Thread.setPriority(10);

        task3Thread.start();

        System.out.println("Main Thread");


    }
}

class Task1 extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 1; i < 99; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nTask 1 Completed"); //DEAD
    }
}

class Task2 implements Runnable {

    @Override
    public void run() {
        for (int i = 1000; i < 1099; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nTask 2 completed"); //DEAD
    }
}
