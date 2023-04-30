package observer.notification;

import observer.order.Order;

public class TextMessage implements Observer {
    public void update(Order order) {
        System.out.println("SMS - Zamowinie numer: " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }
}
