public class BankAccount{
    double balance = 100;


    void withdraw(float amount){
        if (amount > 500){
            System.out.println("The withdraw amount is too large. You can withdraw only 500 PLN");
        }else if (amount > balance) {
            System.out.println("You don't have enough money on your account");
        }else{
            System.out.println("Succesfull withdraw: "+amount);
        balance -= amount;
        }
    }
    void deposit(float amount){
        System.out.println("You deposit: " + amount +" PLN");
        balance += amount;
    }
    void display(){
        System.out.println("Your balanace is: " + balance);
    }
    public static void main(String[] args){
        BankAccount B = new BankAccount();
        B.withdraw(500);
        B.display();
        B.deposit(200);
        B.display();
        B.withdraw(300);
        B.display();

    }

}
