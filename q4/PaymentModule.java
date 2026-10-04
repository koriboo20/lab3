public class PaymentModule {

    protected double totalPay;

    public PaymentModule(double totalPay) {
        this.totalPay = totalPay;
    }

    public void payment(Employee e) {
        double pay = e.computePay();

        // instanceof checks the RUNTIME type before we downcast, so the
        // cast below is guaranteed safe - this is a "safe downcast".
        if (e instanceof Manager) {
            Manager mgr = (Manager) e;
            if (mgr.getWorkYear() > 10) {
                pay = pay * 2;
            }
        }

        totalPay += pay;
    }

    public double getTotalPay() {
        return totalPay;
    }
}
