public class Furniture {

    private final static int VAT_PERCENTAGE = 30;

    private String name;
    private double price;

    public Furniture(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public double getPriceNetto(){
        return price - price * (VAT_PERCENTAGE / 100);
    }

    public double getPriceBrutto(){
        return price;
    }
}