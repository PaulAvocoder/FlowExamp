package com.pavel;

import java.util.concurrent.Flow;

class ContentSubscription implements Flow.Subscription{

    Flow.Subscriber contentSubscriber;

    public ContentSubscription(Flow.Subscriber contentSubscriber) {
        this.contentSubscriber = contentSubscriber;
    }

    @Override
    public void request(long n) {
        int i=0;
        while (i<8){
            try {
                Thread.sleep(n);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            contentSubscriber.onNext("Сообщение номер: "+ (i+1));
            i++;
        }
    }

    @Override
    public void cancel() {

    }
}