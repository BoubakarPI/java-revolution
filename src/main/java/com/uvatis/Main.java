package com.uvatis;

import com.uvatis.model.BankAccount;

public class Main {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setBalance(152);
        System.out.println(account1.getBalance());
    }
}