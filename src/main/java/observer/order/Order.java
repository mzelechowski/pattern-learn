package observer.order;

import observer.notification.Observer;

import java.util.HashSet;
import java.util.Set;

public class Order implements Observable {
    private Long orderNumber;
    private OrderStatus orderStatus;
    private Set<Observer> registeredObservers = new HashSet<Observer>();

    public Order(Long orderNumber, OrderStatus orderStatus) {
        this.orderNumber = orderNumber;
        this.orderStatus = orderStatus;
    }

    @Override
    public void registerObserver(Observer observer) {
        registeredObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        registeredObservers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        registeredObservers.forEach(u -> u.update(this));

    }

    public void changeOrderStatus(OrderStatus orderStatus) {
        setOrderStatus(orderStatus);
        notifyObserver();
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}
