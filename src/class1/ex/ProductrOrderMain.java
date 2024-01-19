package class1.ex;

public class ProductrOrderMain {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        ProductOrder order1 = new ProductOrder();
        order1.productName = "두부";
        order1.price = 2000;
        order1.quantity = 2;
        orders[0] = order1;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "콜라";
        order2.price = 1500;
        order2.quantity = 3;
        orders[1] = order2;

        ProductOrder order3 = new ProductOrder();
        order3.productName = "콩나물";
        order3.price = 2500;
        order3.quantity = 4;
        orders[2] = order3;

        int totalAmount = 0;
        for (ProductOrder order : orders) {
            System.out.println(order.productName + order.price+ order.quantity);

            totalAmount += order.price;
        }
        System.out.println(totalAmount);
    }
}
