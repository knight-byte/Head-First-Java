


public class ThreadTester {
    public static void main(String[] args) {
        Runnable threadJob=new MyRunnable();
        Thread myThread=new Thread(threadJob);

        myThread.start();
        System.out.println("back to main");
     
    }
}


class MyRunnable implements Runnable{
    public void  run() {
        go();
       System.out.println("run done");

    }

    public void go(){
        doMore();
        System.out.println("go done");
    }
    
    public void doMore() {
        try{
        Thread.sleep(20000);
        }
        catch(InterruptedException ex){
            ex.printStackTrace();
        }
        System.out.println("Top o' the Stack");
    }
}
