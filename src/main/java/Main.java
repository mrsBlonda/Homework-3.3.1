public class Main {
    public static void main (String[] args) throws InterruptedException {
        Box box = new Box();
        Thread user = new Thread(null, () -> box.activation(), "Пользователь");
        Thread toy = new Thread(null, () -> box.shutdown(), "Игрушка");
        user.start();
        toy.start();

        user.join();
        toy.interrupt();

    }
}
