// Design an interface `Payment` with method `pay(double amount)`. Implement classes `UPI`, `CreditCard`, and `NetBanking`.

interface Payment {
    void pay(double amount);
}

class UPI implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println(amount + "$" + " Paying using UPI...");
    }
}

class CreditCard implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println(amount + "$" + " Paying using CreditCard...");
    }
}

class NetBanking implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println(amount + "$" + " Paying using NetBanking...");
    }
}

public class Main {

    public static void main(String[] args) {
        Payment p;

        p = new UPI();
        p.pay(455.50);

        p = new CreditCard();
        p.pay(5478.56);

        p = new NetBanking();
        p.pay(5478.56);
    }
}
