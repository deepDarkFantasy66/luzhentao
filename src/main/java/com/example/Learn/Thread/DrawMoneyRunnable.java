package com.example.Learn.HashSet.Thread;

public class DrawMoneyRunnable extends Thread {
    private Account account;

    public DrawMoneyRunnable(Account account, String name) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        account.DrawMoney2(100000.0);
    }
}
