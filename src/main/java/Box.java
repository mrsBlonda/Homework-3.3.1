public class Box {
    public static final int TIME_SLEEP = 2000;
    private volatile boolean isToy = false;

    public void activation() {
        int countIterate = 5;
        for (int i = 0; i < countIterate; i++) {
            if (isToy == false) {
                System.out.println("Игрушка включена");
                isToy = true;
            }
            try {
                Thread.sleep(TIME_SLEEP);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void shutdown() {
        while (!Thread.currentThread().isInterrupted()) {
            if (isToy == true) {
                System.out.println("Игрушка отключена");
                isToy = false;
            }

        }
    }
}



