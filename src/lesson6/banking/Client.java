package lesson6.banking;

public class Client extends Person implements Banking{

    protected String bankName;


    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    // Constructor.
    public Client(String name, String surName){
        super(name, surName);
    }
    public Client(String name, String surName, String bankName){
        super(name, surName);
        this.bankName = bankName;
    }

    @Override
    public void print(){
        System.out.println("Client name: " + name + "\n" +
                "Client surname: " + surName + "\n" +
                "Customer of bank: " + bankName);
    }


    @Override
    public void openAccount() {
        BankEmployee bankEmployee = new BankEmployee("John",
                "SMITH", "BofA");
        bankEmployee.openAccount();
    }

    @Override
    public void closeAccount() {
        BankEmployee bankEmployee = new BankEmployee("John",
                "SMITH", "BofA");
        bankEmployee.closeAccount();
    }

    @Override
    public void deposit() {
    }

    @Override
    public void withdraw() {
    }
}
