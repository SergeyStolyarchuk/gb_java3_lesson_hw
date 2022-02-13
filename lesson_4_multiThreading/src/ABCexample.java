public class ABCexample {
    private final Object MONITOR = new Object();
    private volatile char currentLetter = 'A';

    public static void main(String[] args) {
        ABCexample printABC = new ABCexample();
        Thread threadA = new Thread(printABC :: printA);
        Thread threadB = new Thread(printABC :: printB);
        Thread threadC = new Thread(printABC :: printC);

        threadA.start();
        threadB.start();
        threadC.start();

    }

    public void printA (){
        synchronized (MONITOR) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (currentLetter != 'A') {
                        MONITOR.wait();
                    }
                    System.out.println("A");
                    currentLetter = 'B';
                    MONITOR.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void printB (){
        synchronized (MONITOR) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (currentLetter != 'B') {
                        MONITOR.wait();
                    }
                    System.out.println("B");
                    currentLetter = 'C';
                    MONITOR.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printC (){
        synchronized (MONITOR) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (currentLetter != 'C') {
                        MONITOR.wait();
                    }
                    System.out.println("C");
                    currentLetter = 'A';
                    MONITOR.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
