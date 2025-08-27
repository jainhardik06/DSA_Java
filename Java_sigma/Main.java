class MyThread extends Thread {
    public void run() {
        System.out.println("Thread started. Name: " + getName());

        try {
            Thread.sleep(5000); // Sleep for 5 seconds
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        // Change thread name after sleep
        setName("RenamedThread");
        System.out.println("Thread woke up. New name: " + getName());
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t = new MyThread();

        // Set initial name (optional)
        t.setName("InitialThread");

        t.start();
    }
}
