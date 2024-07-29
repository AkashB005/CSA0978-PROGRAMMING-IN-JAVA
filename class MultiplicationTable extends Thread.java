class MultiplicationTable extends Thread {
    private int number;
    public MultiplicationTable(int number) {
        this.number = number;
    }
    @Override
    public void run() {
        System.out.println("Multiplication table for " + number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " X " + i + " = " + (number * i));
        }
        System.out.println("Thread for " + number + " has finished executing.");
    }
}
public class main {
    public static void main(String[] args){
        MultiplicationTable table5 = new MultiplicationTable(5);
        MultiplicationTable table10 = new MultiplicationTable(10);
        System.out.println("Starting threads...");
        table5.start();
        table10.start();
        try {
            table5.join();
            table10.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("All threads have finished executing.");
    }
}