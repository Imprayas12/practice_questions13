class Least extends Thread{

    @Override
    public void run(){
        for(int i=0;i<5;i++) System.out.println(this.getName());

    }
}
class MiddleClass extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) System.out.println(this.getName());

    }
}
class UpperClass extends Thread{
    @Override
    public void run(){

        for (int i = 0; i < 5; i++) {
            System.out.println(this.getName());
        }
    }
}
public class Priority {
    public static void main(String[] args) {
        Least p1 = new Least();
        Least p2 = new Least();
        Least p3 = new Least();
        p1.setPriority(Thread.MIN_PRIORITY);
        p2.setPriority(Thread.NORM_PRIORITY);
        p3.setPriority(Thread.MAX_PRIORITY);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p3.getPriority());
        p1.start();
        p3.start();
        p2.start();
    }
}
