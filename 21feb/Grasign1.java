       // WAP to create a bank account class with private variables, account number,
// account holder name, balance and the public methods deposite,
// withdrawl, getbalance, getAccountDetails.

class       BankAccount{
    private String accountNumber;
    private String name;
    private double balance;
    
    public BankAccount(String accno, String n, double b){
        accountNumber = accno;
        name = n;
        balance = b;
    }
    
    public void deposite(){
        System.out.println("In deposite");
    }
    
    public void withDrawl(){
        System.out.println("With draw money");
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void getAccountDetails(){
        System.out.println("Account number: "+accountNumber);
        System.out.println("Name of the account holder: "+name);
        System.out.println("Balance: "+balance);
    }
}

class Grasign1{
    public static void main(String...args){
        BankAccount b = new BankAccount("5674", "HEHE", 106.0);
        b.getAccountDetails();
    }
}