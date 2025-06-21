package com.ranjan.app.NewsFeedObservers.impl;

import java.util.logging.Logger;

import com.ranjan.app.NewsFeedObservers.NewsFeedProcessor;

public class EmailNewsFeedProcessor implements NewsFeedProcessor {

    Logger logger=Logger.getLogger(EmailNewsFeedProcessor.class.getSimpleName());

    @Override
    public void process(String msg) {
        logger.info("News Recieved::"+msg);
    }
    
}
