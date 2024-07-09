package ac.za.tut.sosha;

import za.ac.tut.entity.AccountManager;

public class WithdrawThread implements Runnable
{
    private Double cash;
    private AccountManager manage;

    public WithdrawThread(Double cash, AccountManager manage) {
        this.cash = cash;
        this.manage = manage;
    }
    @Override
    public void run() 
    {
        manage.WithdrawMoney(cash);
    }
    
}
