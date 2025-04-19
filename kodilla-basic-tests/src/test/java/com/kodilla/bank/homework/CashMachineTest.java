package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CashMachineTest {

    @Test
    public void testEmptyCashMachine() {
        CashMachine machine = new CashMachine();
        assertEquals(0, machine.getBalance());
        assertEquals(0, machine.getTransactionCount());
        assertEquals(0, machine.getWithdrawalCount());
        assertEquals(0, machine.getDepositCount());
        assertEquals(0.0, machine.getAverageWithdrawal());
        assertEquals(0.0, machine.getAverageDeposit());
    }

    @Test
    public void testOnlyDeposits() {
        CashMachine machine = new CashMachine();
        machine.addTransaction(100);
        machine.addTransaction(200);
        assertEquals(300, machine.getBalance());
        assertEquals(2, machine.getTransactionCount());
        assertEquals(2, machine.getDepositCount());
        assertEquals(0, machine.getWithdrawalCount());
        assertEquals(150.0, machine.getAverageDeposit());
        assertEquals(0.0, machine.getAverageWithdrawal());
    }

    @Test
    public void testOnlyWithdrawals() {
        CashMachine machine = new CashMachine();
        machine.addTransaction(-50);
        machine.addTransaction(-150);
        assertEquals(-200, machine.getBalance());
        assertEquals(2, machine.getTransactionCount());
        assertEquals(0, machine.getDepositCount());
        assertEquals(2, machine.getWithdrawalCount());
        assertEquals(-100.0, machine.getAverageWithdrawal());
        assertEquals(0.0, machine.getAverageDeposit());
    }

    @Test
    public void testZeroTransactionIsIgnored() {
        CashMachine machine = new CashMachine();
        machine.addTransaction(0); // should be ignored
        assertEquals(0, machine.getTransactionCount());
        assertEquals(0, machine.getBalance());
    }

    @Test
    public void testMixedTransactions() {
        CashMachine machine = new CashMachine();
        machine.addTransaction(100);
        machine.addTransaction(-40);
        machine.addTransaction(60);
        machine.addTransaction(-20);
        assertEquals(100, machine.getBalance());
        assertEquals(4, machine.getTransactionCount());
        assertEquals(2, machine.getDepositCount());
        assertEquals(2, machine.getWithdrawalCount());
        assertEquals(80.0, machine.getAverageDeposit());
        assertEquals(-30.0, machine.getAverageWithdrawal());
    }
}