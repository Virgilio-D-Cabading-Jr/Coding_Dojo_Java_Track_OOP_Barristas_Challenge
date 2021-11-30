import java.util.ArrayList;

//  ////////////////////////////////////////////////////////////////
//  ORDER TEST
//  By: Virgilio D. Cabading Jr.    Created at: November 29, 2021 1115
//  ////////////////////////////////////////////////////////////////

public class OrderTest {
    public static void main(String[] args) {
        System.out.println("/////////////////////////////////////////////////////");
        System.out.println("ORDER TEST APP\n");
        
        ArrayList<Order> orderList = new ArrayList<Order>();        // Create an empty list of orders

        // **** Create a Menu *********
        Item dripCoffee = new Item("Drip Coffee", 1.75);
        Item cafeLatte = new Item("Cafe Latte", 3.75);
        Item mocha = new Item("Mocha", 3.5);
        Item cappuccino = new Item("Cappuccino", 4.0);
        Item caramelMachiato = new Item("Caramel Machiatto", 4.0);
        System.out.println("/////////////////////////////////////////////////////");
        System.out.println("Barrista Challenge Menu: ");
        System.out.println(dripCoffee.getItem());
        System.out.println(cafeLatte.getItem());
        System.out.println(mocha.getItem());
        System.out.println(cappuccino.getItem());
        System.out.println(caramelMachiato.getItem());
        System.out.println("");

        System.out.println("*****************************************************");
        System.out.println("Create two orders of unspecified guests\n");
        orderList.add(new Order());
        orderList.add(new Order());
        printOrderList(orderList);

        System.out.println("*****************************************************");
        System.out.println("Create three orders of overloaded constructor with a name for each order\n");
        orderList.add(new Order("Superman"));
        orderList.add(new Order("Batman"));
        orderList.add(new Order("Wonder Woman"));
        printOrderList(orderList);

        System.out.println("*****************************************************");
        System.out.println("Add at least 2 items to each order using addItem method\n");
        orderList.get(0).addItem(dripCoffee);
        orderList.get(0).addItem( cafeLatte );
        orderList.get(1).addItem( dripCoffee );
        orderList.get(1).addItem( mocha );
        orderList.get(2).addItem( dripCoffee );
        orderList.get(2).addItem( cappuccino );
        orderList.get(2).addItem( caramelMachiato );
        orderList.get(3).addItem( cafeLatte );
        orderList.get(3).addItem( cappuccino );
        orderList.get(4).addItem( dripCoffee );
        orderList.get(4).addItem( cafeLatte );
        orderList.get(4).addItem( caramelMachiato );
        printOrderList(orderList);

        System.out.println("*****************************************************");
        System.out.println("Guest 2, Superman, and Wonder Woman's orders are now ready\n");
        orderList.get(1).setReady(true);
        orderList.get(2).setReady(true);
        orderList.get(4).setReady(true);
        for (Order order : orderList) {
            if (order.getReady() == true) {
                System.out.println("----------------");
                System.out.printf("%s, your order is Ready and your order costs a total of $%.2f\n  ", order.getName(), order.getOrderTotal());
            }
        }

        System.out.println("*****************************************************");
        System.out.println("Print all the orders");
        printOrderList(orderList);
    }

    //  ---- Print Order List --------------------------------------
    public static void printOrderList (ArrayList<Order> orderList) {
        for (int i=0; i<orderList.size(); i++) {
            System.out.printf("---- Order #%d ------------\n", i+1);
            orderList.get(i).display();
        }
        System.out.println("");
    }
}

