public class Der_Lagegi extends Thread{
    public static void main(String[] args) throws InterruptedException{
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if(i==5)
                Thread.sleep(5000);
        }
    }
}
