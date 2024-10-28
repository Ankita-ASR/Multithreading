class NamingRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello from " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new NamingRunnable(), "Amy");
        Thread thread2 = new Thread(new NamingRunnable(), "Any");
        Thread thread3 = new Thread(new NamingRunnable(), "Rony");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
