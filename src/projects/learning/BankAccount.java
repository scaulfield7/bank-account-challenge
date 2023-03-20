package projects.learning;

public class BankAccount {
    private String accountNumber;
    private double accountBalance;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
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
