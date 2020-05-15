public class RunThreads implements Runnable{
    public static void main(String[] args) {
        RunThreads runner=new RunThreads();
        Thread alpha=new Thread(runner);
        Thread beta=new Thread(runner);
        alpha.setName("alpha thread");
        beta.setName("beta thread");
        alpha.start();
        beta.start();
        System.out.println("main class");
    }

    public void run(){
        for(int i=0;i<25;i++){
            String name=Thread.currentThread().getName();
            System.out.println(name+" : is running");
        }
    }
}