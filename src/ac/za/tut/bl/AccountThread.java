package ac.za.tut.bl;

import ac.za.tut.sosha.DepositThread;
import ac.za.tut.sosha.WithdrawThread;
import za.ac.tut.entity.Account;
import za.ac.tut.entity.AccountManager;

public class AccountThread 
{
    public static void main(String[] args) 
    {
        Account account = new Account();
        AccountManager manage = new AccountManager(account);
        
        DepositThread t1 = new DepositThread(100.0,manage);
        Thread phomolo = new Thread(t1);
        phomolo.setName("Phomolo");
        phomolo.start();
        
        DepositThread t2 = new DepositThread(223.0,manage);
        Thread vusi = new Thread(t2);
        vusi.setName("Vusi");
        vusi.start();
        
        
        WithdrawThread d1 = new WithdrawThread(350.0,manage);
        Thread tumi = new Thread(d1);
        tumi.setName("Tumi");
        tumi.start();
        
        WithdrawThread d2 = new WithdrawThread(150.0,manage);
        Thread phaki = new Thread(d2);
        phaki.setName("Phaki");
        phaki.start();
        
        WithdrawThread d3 = new WithdrawThread(100.0,manage);
        Thread onicca = new Thread(d3);
        onicca.setName("onicca");
        onicca.start();
    }
}
