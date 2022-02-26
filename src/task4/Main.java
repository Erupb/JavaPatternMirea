package task4;

public class Main {
    public static void main(String[] args) {
        AnExecutor executorService = new AnExecutor(3);
        executorService.submit(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("We run it");
        });
        executorService.submit(() -> System.out.println("Start"));
    }
}
