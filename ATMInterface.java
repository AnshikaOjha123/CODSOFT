import java.util.*;
class  ATMInterface{int Accountbal=5000;
public void UserAccount(int Accountbal) {
    System.out.println("Current Balance:" +Accountbal);
    System.out.println();
}
public void menu() {
    System.out.println("enter your choice:");
    System.out.println("1.Withdrawing\n2.Depositing\n3.Checking the balance\n4.Exit");
    Scanner sc = new Scanner(System.in);
    int choice = sc.nextInt();
    if (choice == 1) {
        Withdraw();
    }
    if (choice == 2) {
        Deposit();
    }
    if (choice == 3) {
        CheckBalance();
    } else {
        System.out.println("Enter valid choice");
    }
}
   public  void Withdraw() {
        System.out.println("Enter Amount:");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        if (amount > Accountbal) {
            System.out.println("Insufficient Balance");
        } else {
            Accountbal = Accountbal - amount;
            System.out.println("Money withdraw Succesful");
            System.out.println("Please collect your money and take the card");
        }
        UserAccount(Accountbal);
        menu();
    }
    public void Deposit() {
        System.out.println("Enter Amount:");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        Accountbal = Accountbal + amount;
        System.out.println("Money Deposit Successful");
        System.out.println("Please collect your money and take the card");
        UserAccount(Accountbal);
        menu();
    }
    public void CheckBalance() {
        System.out.println("Available Balance:" + Accountbal);
        menu();
    }
    public static void main(String[] args) {
        ATMInterface atm1 = new ATMInterface();
        ATMInterface atm2 = new ATMInterface();
        ATMInterface atm3 = new ATMInterface();
        atm1.CheckBalance();
        atm2.Withdraw();
        atm3.Deposit();
    }
}
