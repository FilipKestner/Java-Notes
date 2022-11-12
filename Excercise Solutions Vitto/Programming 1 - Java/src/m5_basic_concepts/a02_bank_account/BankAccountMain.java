package m5_basic_concepts.a02_bank_account;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount greg = new BankAccount("Gregory Persons", "BE15 6474 3001 5840");
        System.out.println(greg);
        greg.deposit(3000);
        System.out.println(greg);
        if (greg.withdraw(2000)) {
            // opname geeft true terug
            System.out.println(greg);
        } else {
            System.out.println("Insufficient credit");
        }
        if (greg.withdraw(1500)) {
            // opname geeft false terug
            System.out.println(greg);
        } else {
            System.out.println("Insufficient credit");
        }
        BankAccount carl = new BankAccount("Carl Deleu", "BE45 8477 0157 5478", 35652);
        System.out.println("\n" + carl);
        carl.deposit(6487);
        System.out.println(carl);
    }
}
