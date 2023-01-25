package mentoring.thread;

public class CommonCalculate {
    private int amount;
    private int interest;
    private Object interestLock = new Object();
    private Object amountLock = new Object();

    public CommonCalculate() {
        amount = 0;
    }

    public void plus(int value) {
        synchronized (amountLock) {
            amount += value;
        }

    }

    public void addInterest(int value) {
        synchronized (interestLock) {
            interest+=value;
        }

    }

    public void minus(int value) {
        synchronized (this) {
            amount -= value;
        }

    }

    public int getAmount() {
        return amount;
    }
}
