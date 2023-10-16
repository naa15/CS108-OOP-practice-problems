package inheritance;

public class Account implements Moodable{

    public static final int DEFAULT_AMOUNT = 0;

    private int amount;

    public Account(int amount){
        this.amount = amount;
    }

    public Account() {
        this(DEFAULT_AMOUNT);
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int newAmount){
        amount = newAmount;
    }

    public void transact(Account other, int transactionAmount) {
        if(transactionAmount <= amount) {
            other.setAmount(other.getAmount() + transactionAmount);
            amount -= transactionAmount;
        }
    }

    @Override
    public Boolean getMood() {
        System.out.println("Account mood: ");
        return amount > 1000;
    }

}
