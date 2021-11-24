import java.util.Random;

public class Colours implements Runnable{
    String[] colours = {"White","Blue","Black","Green","Red","Yellow"};
    Random rad = new Random();
    @Override
    public void run(){
        while (true){
            int n=rad.nextInt(6);
            if(!colours[n].equals("Red")){
                System.out.println(colours[n]);
            }
            else break;
        }
    }

    public static void main(String[] args) {
        new Thread(new Colours()).start();
    }
}