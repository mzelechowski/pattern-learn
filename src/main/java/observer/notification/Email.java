package observer.notification;

import observer.order.Order;

public class Email implements Observer {
    public void update(Order order) {
        System.out.println("Email - Zamowinie numer: " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }
}
