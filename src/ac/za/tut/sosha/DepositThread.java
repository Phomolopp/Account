package ac.za.tut.sosha;

import za.ac.tut.entity.AccountManager;

public class DepositThread implements Runnable
{
    private Double cash;
    private AccountManager manage ;

    public DepositThread(Double cash, AccountManager manage) {
        this.cash = cash;
        this.manage = manage;
    }
            
    
    @Override
    public void run() 
    {
        manage.DepositMoney(cash);
    }
    
}
