package q2;

import java.util.ArrayList;
import java.util.Collections;

class BankAccountTester {
    public static void main(String args[]) {
    	ArrayList<BankAccount> list = new ArrayList<BankAccount>();

        BankAccount ba1 = new BankAccount(100, 6969); //accountNumber and balance
        BankAccount ba2 = new BankAccount(200, 174733);
        BankAccount ba3 = new BankAccount(300, 77777);
        BankAccount ba4 = new BankAccount(600, 0);
        BankAccount ba5 = new BankAccount(800, 420);

        list.add(ba1);
        list.add(ba2);
        list.add(ba3);
        list.add(ba4);
        list.add(ba5);

        Collections.sort(list);

         for (int i = 0; i < list.size(); i++) {
         BankAccount b = list.get(i);
         System.out.println("Account Number: "+ b.getAccountNumber()+ " Balance: " + "$" + b.getBalance());
        }
    }
}

