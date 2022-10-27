package com.pavel;

public class Main {

    public static void main(String[] args) {
        ContentPublisher contentPublisher = new ContentPublisher();
        ContentSubscriber contentSubscriber = new ContentSubscriber(1000l);
        contentPublisher.subscribe(contentSubscriber);
    }

}