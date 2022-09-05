public class Main {
    public static void main(String[] args) throws Exception {
        MyThread thread01 = new MyThread(1);
        MyThread thread02 = new MyThread(2);

        thread01.start();
        thread02.start();
    }
}
