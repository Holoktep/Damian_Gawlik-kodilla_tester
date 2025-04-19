package com.kodilla.bank.homework;

import java.util.List;

public class Bank {
    private CashMachine[] machines;

    public Bank(CashMachine[] machines) {
        this.machines = machines;
    }

    public int getTotalBalance() {
        int total = 0;
        for (CashMachine machine : machines) {
            total += machine.getBalance();
        }
        return total;
    }

    public int getTotalWithdrawalCount() {
        int count = 0;
        for (CashMachine machine : machines) {
            count += machine.getWithdrawalCount();
        }
        return count;
    }

    public int getTotalDepositCount() {
        int count = 0;
        for (CashMachine machine : machines) {
            count += machine.getDepositCount();
        }
        return count;
    }

    public double getAverageWithdrawal() {
        int sum = 0;
        int count = 0;
        for (CashMachine machine : machines) {
            List<Integer> transactions = machine.getTransactions();
            for (int t : transactions) {
                if (t < 0) {
                    sum += t;
                    count++;
                }
            }
        }
        return count == 0 ? 0 : (double) sum / count;
    }

    public double getAverageDeposit() {
        int sum = 0;
        int count = 0;
        for (CashMachine machine : machines) {
            List<Integer> transactions = machine.getTransactions();
            for (int t : transactions) {
                if (t > 0) {
                    sum += t;
                    count++;
                }
            }
        }
        return count == 0 ? 0 : (double) sum / count;
    }
}