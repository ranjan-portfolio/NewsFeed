package com.ranjan.app.NewsFeedObservers.impl;

import java.util.logging.Logger;

import com.ranjan.app.NewsFeedObservers.NewsFeedProcessor;

public class MobileNewsFeedProcessor implements NewsFeedProcessor{

    Logger logger=Logger.getLogger(MobileNewsFeedProcessor.class.getSimpleName());

    @Override
    public void process(String msg) {
         logger.info("News Recieved::"+msg);
    }
    
}
