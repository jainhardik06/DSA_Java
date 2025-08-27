class ProducerConsumer {
    private int value;
    private boolean available = false;

    public synchronized void produce(int val) throws InterruptedException {
        while (available) {
            wait(); // Wait if value is already produced but not consumed
        }
        this.value = val;
        System.out.println("Produced: " + value);
        available = true;
        notify(); // Notify consumer that value is available
    }

    public synchronized void consume() throws InterruptedException {
        while (!available) {
            wait(); // Wait if no value to consume
        }
        System.out.println("Consumed: " + value);
        available = false;
        notify(); // Notify producer that value has been consumed
    }
}

class Producer extends Thread {
    private ProducerConsumer pc;

    public Producer(ProducerConsumer pc) {
        this.pc = pc;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                pc.produce(i);
                Thread.sleep(1000); // simulate time to produce
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private ProducerConsumer pc;

    public Consumer(ProducerConsumer pc) {
        this.pc = pc;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                pc.consume();
                Thread.sleep(1000); // simulate time to consume
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ProducerConsumerProblem {
    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();
        Producer producer = new Producer(pc);
        Consumer consumer = new Consumer(pc);

        producer.start();
        consumer.start();
    }
}
