package com.kodilla.bank.homework;

import java.util.ArrayList;
import java.util.List;

public class CashMachine {
    private List<Integer> transactions;

    public CashMachine() {
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(int amount) {
        if (amount == 0) return;
        transactions.add(amount);
    }

    public int getBalance() {
        return transactions.stream().mapToInt(Integer::intValue).sum();
    }

    public int getTransactionCount() {
        return transactions.size();
    }

    public int getWithdrawalCount() {
        return (int) transactions.stream().filter(t -> t < 0).count();
    }

    public int getDepositCount() {
        return (int) transactions.stream().filter(t -> t > 0).count();
    }

    public double getAverageWithdrawal() {
        return transactions.stream()
                .filter(t -> t < 0)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
    }

    public double getAverageDeposit() {
        return transactions.stream()
                .filter(t -> t > 0)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
    }

    public List<Integer> getTransactions() {
        return new ArrayList<>(transactions);
    }
}