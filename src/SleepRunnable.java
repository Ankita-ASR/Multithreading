class SleepRunnable implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + ": Starting...");
            Thread.sleep(3000); // Sleep for 3 seconds
            System.out.println(Thread.currentThread().getName() + ": Finished sleeping!");
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted.");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new SleepRunnable(), "Thread 1");
        Thread thread2 = new Thread(new SleepRunnable(), "Thread 2");
        Thread thread3 = new Thread(new SleepRunnable(), "Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
