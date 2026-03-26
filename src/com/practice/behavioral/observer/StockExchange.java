package com.practice.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * This class demonstrate the Subject (Observable).
 * It maintains a list of observers (subscribers) and provides methods to subscribe, unsubscribe, and notify them of changes.
 * In this example, the StockExchange class is the subject that notifies its observers (StockObserver) whenever there is a change in stock prices.
 * The observers can be different types of displays, such as a mobile app, TV news screen, or a trader's application, each implementing the StockObserver interface to receive updates about stock price changes.
 */
public class StockExchange {
    private final List<StockObserver> observers  = new ArrayList<>();

    public void subscribe(StockObserver observer) {
        observers.add(observer);
    }

    public void unsubscribe(StockObserver observer) {
        observers.remove(observer);
    }

    public void updatePrice(String stockName, double price) {
        System.out.println("Updating price for " + stockName + ": " + price);
        // Notify all subscribers
        for (StockObserver observer : observers) {
            observer.updateStock(stockName, price);
        }
    }
}
