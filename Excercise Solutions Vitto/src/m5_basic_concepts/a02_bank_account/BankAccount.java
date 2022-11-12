package m5_basic_concepts.a02_bank_account;

public class BankAccount {
    private String holder;
    private String iban;
    private double balance;
    private boolean withdrawResult;

    public BankAccount(String holder, String iban, double balance) {
        setHolder(holder);
        setIban(iban);
        setBalance(balance);
    }
    public BankAccount(String holder, String iban){
        this(holder, iban, 0.0);
    }

    public String getHolder() {
        return holder;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }
    public String getIban() {
        return iban;
    }
    public void setIban(String iban) {
        this.iban = iban;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        balance+=amount;
    }
    public boolean withdraw(double amount){
        if(balance - amount < 0){
            return withdrawResult = false;
        }
        else{
            balance-=amount;
            return withdrawResult = true;
        }
    }

    public String toString() {
        return String.format("The account %s of %s has a balance of € %f", this.iban, this.holder, this.balance);
    }

    }
