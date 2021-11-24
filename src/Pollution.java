class Pollution2 extends Thread{
    @Override
    public void run(){
        for (int i = 2; i <= 20; i+=2) {
            System.out.println(i);
        }
    }
}
public class Pollution extends Thread{
    @Override
    public void run() {
        try {
            new Pollution().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 1; i < 20; i+=2) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        new Pollution2().start();
        new Pollution().start();
    }
}