package com.practice.behavioral.observer;

/**
 * This class demonstrate the observer design patter where one object change its state, all its dependents are notified and updated automatically.
 * In this example, we have a StockExchange class that maintains a list of StockObserver objects.
 * Whenever the stock price is updated, the StockExchange notifies all the subscribed observers about the change.
 * The observers can be different types of displays, such as a mobile app, TV news screen, or a trader's application, each implementing the StockObserver interface to receive updates about stock price changes.
 */
public class MainFunction {
    static void main() {
        StockExchange stockExchange = new StockExchange();

        StockObserver mobile = new MobileAppDisplay("LGN");
        StockObserver tvNews = new TvNewsScreen("CNN");
        StockObserver traderApp = new TraderAppDisplay("TRD123");

        stockExchange.subscribe(mobile);
        stockExchange.subscribe(tvNews);
        stockExchange.subscribe(traderApp);

        stockExchange.updatePrice("AAPL", 150.00);

        stockExchange.unsubscribe(traderApp);

        stockExchange.updatePrice("GOOGL", 2800.00);
    }
}
