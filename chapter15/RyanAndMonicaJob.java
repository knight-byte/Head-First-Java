

class BankAccount{
    private int balance=100;
    public int getBalance(){
        return balance;
    }

    public void withDraw(int amount){
        balance-=amount;
    }
}

public class RyanAndMonicaJob implements Runnable {
    private BankAccount account=new BankAccount();
    public static void main(String[] args) {
        RyanAndMonicaJob theJob=new RyanAndMonicaJob();
        Thread one=new Thread(theJob);
        Thread two=new Thread(theJob);

        one.setName("Ryan");
        two.setName("Monica");
        one.start();
        two.start();

    }

    public void run(){
        for (int i = 0; i < 10; i++) {
            makeWithdrawl(10);
            if(account.getBalance()<0){
                System.out.println("OverWithDrawn!");
            }
        }
    }

    private synchronized void makeWithdrawl(int amount){
        if(account.getBalance()>=amount){
            System.out.println(Thread.currentThread().getName()+" is about to withdrawl ");
            try {
                System.out.println(Thread.currentThread().getName()+" is going to sleep");
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
           }

           System.out.println(Thread.currentThread().getName()+" woke up");
           account.withDraw(amount);
           System.out.println(Thread.currentThread().getName()+" completed the withdrawl \n");
        }
        else{
            System.out.println("Sorry, not Enought for "+ Thread.currentThread().getName());
        }
    }
}