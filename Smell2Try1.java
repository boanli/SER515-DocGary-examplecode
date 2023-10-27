package ser515.smells;

public class Smell2Try1 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("USAGE: java ser515.smells.Smell2Try1 <amt>");
            System.exit(0);
        }

        Account s = new Savings(Float.parseFloat(args[0]));
        Account c = new Checking(Float.parseFloat(args[0]));

        processAccount(s);
        processAccount(c);
        System.out.println("Checking, Savings, after operations: " + c + ", " + s);
    }

    private static void processAccount(Account account) {
        account.withdraw(100.0f);
        account.computeInterest();
        account.withdraw(50.0f);
        account.computeInterest();
        account.withdraw(100.0f);
        if (account instanceof Checking) {
            ((Checking) account).computePenalties();
        }
    }
}

