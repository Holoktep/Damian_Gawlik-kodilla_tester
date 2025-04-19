package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankTest {

    @Test
    public void testBankWithNoMachines() {
        Bank bank = new Bank(new CashMachine[0]);
        assertEquals(0, bank.getTotalBalance());
        assertEquals(0, bank.getTotalDepositCount());
        assertEquals(0, bank.getTotalWithdrawalCount());
        assertEquals(0.0, bank.getAverageDeposit());
        assertEquals(0.0, bank.getAverageWithdrawal());
    }

    @Test
    public void testBankWithOneMachineAndMixedTransactions() {
        CashMachine m1 = new CashMachine();
        m1.addTransaction(200);
        m1.addTransaction(-100);

        Bank bank = new Bank(new CashMachine[]{m1});
        assertEquals(100, bank.getTotalBalance());
        assertEquals(1, bank.getTotalDepositCount());
        assertEquals(1, bank.getTotalWithdrawalCount());
        assertEquals(200.0, bank.getAverageDeposit());
        assertEquals(-100.0, bank.getAverageWithdrawal());
    }

    @Test
    public void testBankWithMultipleMachines() {
        CashMachine m1 = new CashMachine();
        m1.addTransaction(100);
        m1.addTransaction(-50);

        CashMachine m2 = new CashMachine();
        m2.addTransaction(300);
        m2.addTransaction(-100);

        Bank bank = new Bank(new CashMachine[]{m1, m2});
        assertEquals(250, bank.getTotalBalance());
        assertEquals(2, bank.getTotalDepositCount());
        assertEquals(2, bank.getTotalWithdrawalCount());
        assertEquals(200.0, bank.getAverageDeposit());
        assertEquals(-75.0, bank.getAverageWithdrawal());
    }

    @Test
    public void testBankWithEmptyAndActiveMachines() {
        CashMachine empty = new CashMachine();
        CashMachine active = new CashMachine();
        active.addTransaction(100);
        active.addTransaction(-50);

        Bank bank = new Bank(new CashMachine[]{empty, active});
        assertEquals(50, bank.getTotalBalance());
        assertEquals(1, bank.getTotalDepositCount());
        assertEquals(1, bank.getTotalWithdrawalCount());
        assertEquals(100.0, bank.getAverageDeposit());
        assertEquals(-50.0, bank.getAverageWithdrawal());
    }
}
