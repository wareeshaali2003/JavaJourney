package Main.java.lab8;
public class AlphabetPrinter implements Runnable {
    private Thread thread;
    private boolean running = false;

    // Method to start the thread
    public void start() {
        if (thread == null) {
            thread = new Thread(this);
            running = true;
            thread.start();
        }
    }

    // Method to stop the thread
    public void stop() {
        running = false;
    }

    // Method that defines the behavior of the thread
    @Override
    public void run() {
        while (running) {
            for (char c = 'A'; c <= 'Z'; c++) {
                // Print the current letter
                System.out.print(c + " ");
                try {
                    // Sleep for a random time between 0.5 to 1.5 seconds
                    Thread.sleep((long) (Math.random() * 1000 + 500));
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted.");
                }
            }
            stop();  // Stop the thread after printing all letters
        }
    }

    public static void main(String[] args) {
        AlphabetPrinter printer = new AlphabetPrinter();
        printer.start();  // Start the thread to print alphabets

        // Stop the thread after 30 seconds (as a fallback)
        new Thread(() -> {
            try {
                Thread.sleep(30000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            printer.stop();
        }).start();
    }
}
