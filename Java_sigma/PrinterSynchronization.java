class Printer {
    public synchronized void printJob(String jobName) {
        System.out.println(jobName + " started printing...");
        try {
            Thread.sleep(2000); // Simulate print time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(jobName + " finished printing.");
    }
}

class PrintJob extends Thread {
    private Printer printer;
    private String jobName;

    public PrintJob(Printer printer, String jobName) {
        this.printer = printer;
        this.jobName = jobName;
    }

    public void run() {
        printer.printJob(jobName);
    }
}

public class PrinterSynchronization {
    public static void main(String[] args) {
        Printer printer = new Printer();

        PrintJob job1 = new PrintJob(printer, "Job1");
        PrintJob job2 = new PrintJob(printer, "Job2");
        PrintJob job3 = new PrintJob(printer, "Job3");

        job1.start();
        job2.start();
        job3.start();
    }
}
