package lt.codeacademy;

public class Shop implements Comparable<Shop> {
    private Integer id;


    @Override
    public int compareTo(Shop shop) {
        return this.id.compareTo(shop.id);
    }

    public static void main(String[] args) {
        var shop1 = new Shop();
        var shop2 = new Shop();
        var shop3 = new Shop();
        shop1.id = 3;
        shop2.id = 5;
        shop3.id = 10;
        System.out.println(shop1.compareTo(shop2));
        System.out.println(shop2.compareTo(shop2));
        System.out.println(shop2.compareTo(shop1));
        System.out.println(shop3.compareTo(shop1));
    }
}
