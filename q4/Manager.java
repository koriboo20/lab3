public class Manager extends Fulltimer {
    private int workYear;

    public Manager(String n, double s, int w) {
        super(n, s);
        workYear = w;
    }

    @Override
    public double computePay() {
        return super.computePay() * workYear;
    }

    // Added so PaymentModule can check workYear from outside the class
    // without breaking encapsulation (workYear itself stays private).
    public int getWorkYear() {
        return workYear;
    }
}
