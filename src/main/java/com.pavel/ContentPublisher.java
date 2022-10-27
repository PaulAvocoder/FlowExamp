package com.pavel;

import java.util.concurrent.Flow;

public class ContentPublisher implements Flow.Publisher {

    @Override
    public void subscribe(Flow.Subscriber subscriber) {
  subscriber.onSubscribe(new ContentSubscription(subscriber));
    }
}

