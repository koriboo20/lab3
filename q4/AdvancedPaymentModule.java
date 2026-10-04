public class AdvancedPaymentModule extends PaymentModule {

    public AdvancedPaymentModule(double totalPay) {
        super(totalPay);
    }

    // Overloaded, not overridden: same method name, different parameter
    // type (Employee[] instead of Employee). Each element is handed to
    // the PARENT's payment(Employee) via super, so the Manager/workYear
    // doubling logic lives in exactly one place.
    public void payment(Employee[] employees) {
        for (Employee e : employees) {
            super.payment(e);
        }
    }
}
