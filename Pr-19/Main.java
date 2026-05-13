// Design an interface `DeliveryService` with method `deliverOrder()`. Implement classes `ZomatoDelivery` and `SwiggyDelivery`.

interface DeliveryService {

    void deliverOrder();
}

class ZomatoDelivery implements DeliveryService {

    @Override
    public void deliverOrder() {
        System.out.println("Delivering order using Zomato Delivery Service...");
    }
}

class SwiggyDelivery implements DeliveryService {

    @Override
    public void deliverOrder() {
        System.out.println("Delivering order using Swiggy Delivery Service...");
    }
}

public class Main {

    public static void main(String[] args) {

        DeliveryService d;

        d = new ZomatoDelivery();
        d.deliverOrder();

        System.out.println();

        d = new SwiggyDelivery();
        d.deliverOrder();
    }
}