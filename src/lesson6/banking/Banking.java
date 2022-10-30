package lesson6.banking;

public interface Banking {

    String SAVING = "Saving Account";
    String CHECKING = "Checking Account";

    void openAccount();
    void closeAccount();
    void deposit();
    void withdraw();
}
