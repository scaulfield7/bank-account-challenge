package projects.learning;

public class BankAccount {
    private String accountNumber;
    private double accountBalance;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositMoney(double depositAmount) {
        accountBalance += depositAmount;
        System.out.println("Deposited: " + depositAmount);
        displayAccountBalance();
    }

    public void withdrawMoney(double withdrawalAmount) {
        if (accountBalance < withdrawalAmount) {
            System.out.println("Insufficient funds.");
        } else {
            accountBalance -= withdrawalAmount;
            System.out.println("Withdrew: " + withdrawalAmount);
        }
        displayAccountBalance();
    }

    public void displayAccountBalance() {
        System.out.println("Current balance for account " + accountNumber + ": " + accountBalance);
    }
}
