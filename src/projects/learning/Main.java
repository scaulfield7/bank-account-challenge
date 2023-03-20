package projects.learning;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();
        BankAccount bankAccount2 = new BankAccount();

        bankAccount1.setAccountNumber("12345678");
        bankAccount1.setAccountBalance(98000);
        bankAccount1.setFirstName("Anna");
        bankAccount1.setLastName("Murphy");
        bankAccount1.setEmailAddress("annamurphy@email.address");
        bankAccount1.setPhoneNumber("1234512345");

        bankAccount2.setAccountNumber("87654321");
        bankAccount2.setAccountBalance(6600);
        bankAccount2.setFirstName("Hannah");
        bankAccount2.setLastName("Murphy");
        bankAccount2.setEmailAddress("hannahmurphy@email.address");
        bankAccount2.setPhoneNumber("5432154321");

        bankAccount1.withdrawMoney(400);
        bankAccount2.depositMoney(200);
        bankAccount2.withdrawMoney(7000);
        bankAccount2.withdrawMoney(6800);
    }
}
