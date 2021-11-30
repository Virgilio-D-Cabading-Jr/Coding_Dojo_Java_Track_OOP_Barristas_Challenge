import java.util.ArrayList;

//  ////////////////////////////////////////////////////////////////
//  ORDER TEST
//  By: Virgilio D. Cabading Jr.    Created at: November 29, 2021 1115
//  ////////////////////////////////////////////////////////////////

public class OrderTest {
    public static void main(String[] args) {
        System.out.println("/////////////////////////////////////////////////////");
        System.out.println("ORDER TEST APP\n");
        
        ArrayList<Order> orderList = new ArrayList<Order>();

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

