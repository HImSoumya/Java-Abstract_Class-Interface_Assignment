// Create an interface `Discount` with method `applyDiscount(double price)`. Implement classes `FestivalDiscount`, `SeasonalDiscount`, and `MemberDiscount`.

interface Discount {
    double applyDiscount(double price);
}

class FestivalDiscount implements Discount {
    final double FESTIVE_DISCOUNT = 20.5;

    @Override
    public double applyDiscount(double price) {
        double discountedPrice = price * (FESTIVE_DISCOUNT / 100);
        return price - discountedPrice;
    }
}

class SeasonalDiscount implements Discount {
    final double SEASONAL_DISCOUNT = 15.6;

    @Override
    public double applyDiscount(double price) {
        double discountedPrice = price * (SEASONAL_DISCOUNT / 100);
        return price - discountedPrice;
    }
}

class MemberDiscount implements Discount {
    final double MEMBER_DISCOUNT = 40.50;

    @Override
    public double applyDiscount(double price) {
        double discountedPrice = price * (MEMBER_DISCOUNT / 100);
        return price - discountedPrice;
    }
}

public class Main {
    public static void main(String[] args) {
        Discount d;

        d = new FestivalDiscount();
        System.out.println("Discounted Price for Festiv Season: " + d.applyDiscount(5400));

        d = new SeasonalDiscount();
        System.out.println("Discounted Price for Seasonal Offer: " + d.applyDiscount(8400));

        d = new MemberDiscount();
        System.out.println("Discounted Price for Members only: " + d.applyDiscount(14400));
    }
}
