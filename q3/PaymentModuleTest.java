public class PaymentModuleTest {
    public static void main(String[] args) {
        PaymentModule module = new PaymentModule(0);

        Fulltimer fulltimer = new Fulltimer("Alice", 3000);
        Hourly hourly = new Hourly("Bob", 20, 100);
        Manager juniorManager = new Manager("Carla", 4000, 5);   // workYear <= 10, no doubling
        Manager seniorManager = new Manager("Dave", 4000, 12);   // workYear > 10, doubled

        module.payment(fulltimer);
        System.out.println("After Fulltimer: " + module.getTotalPay()); // 3000

        module.payment(hourly);
        System.out.println("After Hourly: " + module.getTotalPay()); // 3000 + 2000 = 5000

        module.payment(juniorManager);
        System.out.println("After junior Manager: " + module.getTotalPay()); // + (4000*5) = 25000

        module.payment(seniorManager);
        // seniorManager.computePay() = 4000*12 = 48000, doubled since workYear > 10 -> 96000
        System.out.println("After senior Manager: " + module.getTotalPay()); // + 96000 = 121000
    }
}
