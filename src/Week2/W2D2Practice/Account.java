package Week2.W2D2Practice;

public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    // Deposit
    public int credit(int amount){
        if(amount>0){
            balance +=amount;
            return balance;
        }else {
            return -1;
        }
    }

    // Withdraw
    public int debit(int amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            return balance;
        }else {
            return -1;
        }
    }

    public int transferTo(Account another, int amount){
        int res = this.debit(amount);
        if(res>-1){
            another.credit(amount);
            return balance;
        }else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public static void main(String[] args) {
        Account account1 = new Account("1","Abdullah",10);
        Account account2 = new Account("2","Ali",1000);
        credit(10,account1);
        credit(10,account1);
        debit(100, account1);

        transfer(200, account2, account1);
        System.out.println(account1);
        System.out.println(account2);







    }

    public static void credit(int amount, Account account){
        System.out.println("========== Withdraw ==========");
        System.out.println("Credit "+amount+" SAR");
        int res = account.debit(amount);
        if(res>-1){
            System.out.println("Credit successfully!");
            System.out.println("New balance: "+res);
        }else {
            System.out.println("You don't have balance! ");
            System.out.println("Your balance is "+account.getBalance());
        }
        System.out.println("============ End ============\n\n");
    }

    public static void debit(int amount, Account account){
        System.out.println("========== Deposit ==========");
        System.out.println("Debit "+amount+" SAR");
        int res = account.credit(amount);
        System.out.println("Debit successfully!");
        System.out.println("New balance: "+res);
        System.out.println("============ End ============\n\n");
    }
    public static void transfer(int amount, Account account1, Account account2){
        System.out.println("========== Transfer ==========");
        System.out.println("Transfer "+amount+" SAR to "+account2.getName());
        int res = account1.transferTo(account2,amount);
        if(res>-1){
            System.out.println("Transfer successfully!");
            System.out.println("New balance: "+res);
        }else {
            System.out.println("You don't have balance! ");
            System.out.println("Your balance is "+account1.getBalance());
        }
        System.out.println("============ End ============\n\n");
    }
}
