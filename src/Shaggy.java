class Scooby extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Scooby");
        }
    }
}
public class Shaggy extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Shaggy");
        }
    }
    public static void main(String[] args) {
     new Scooby().start();
     new Shaggy().start();
    }
}