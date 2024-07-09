package za.ac.tut.entity;
public class AccountManager implements Accountinterface
{
    Account account;

    public AccountManager(Account account) {
        this.account = account;
    }

    @Override
    public synchronized void WithdrawMoney(Double cash) 
    {
        int x = 0;
        Double money = 0.0;
        System.out.print("Type :Withdraw\nName :"+Thread.currentThread().getName()+"\n---------------------"
                + "--------------------------\n");
        for (int i = 0; i < 5; i++) 
        {
            x++;
            
            
            if(account.getMoney()>= cash)
            {
                money = account.getMoney() - cash;
                
                System.out.println("Transection :"+x+"\nAvailable Balance Before:R"+account.getMoney()+"Withdraw Amount :R"+cash+"\n"
                    + "Current Balance :R"+money+"\n=====End");
                account.setMoney(money);
            }
            else
            {
                System.out.println("!!!!!!!!!!!!!!!INSUFICIENT FUNDS!!!!!!!!!!!!!!!!!!!!!!\n:Available Balance >R"+account.getMoney()+"\n"
                        + "Withdraw Amount >R"+cash);
                break;
            }
        }
    }
    @Override
    public synchronized void DepositMoney(Double cash) 
    {
        int x = 0;
        Double money = 0.0;
        System.out.print("Type :Deposit\nName :"+Thread.currentThread().getName()+"\n---------------------"
                + "--------------------------\n");
        for (int i = 0; i < 5; i++)
        {
            x++;
            money = account.getMoney() + cash;
            System.out.println("Transection :"+x+"\nAvailable Balance :R"+account.getMoney()+"\nDeposit Amount :R"+cash+"\n"
                    + "Current Balance :R"+money+"\n=====End");
            account.setMoney(money);
        }
        System.out.println("-----------------END OF TRANSECTIONS--------------------\n");
    }
}
