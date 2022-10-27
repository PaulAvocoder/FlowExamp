package com.pavel;

import java.util.concurrent.Flow;

public class ContentSubscriber implements Flow.Subscriber {

    private long amountofData;

    public ContentSubscriber(long amountofData) {
        this.amountofData = amountofData;
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
     subscription.request(amountofData);
    }

    @Override
    public void onNext(Object item) {
        System.out.println(item);
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onComplete() {

    }
}
