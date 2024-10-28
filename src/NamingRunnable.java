class NamingRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello from " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new NamingRunnable(), "Alpha");
        Thread thread2 = new Thread(new NamingRunnable(), "Beta");
        Thread thread3 = new Thread(new NamingRunnable(), "Gamma");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
