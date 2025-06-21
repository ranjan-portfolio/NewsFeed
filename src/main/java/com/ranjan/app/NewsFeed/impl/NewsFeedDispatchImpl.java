package com.ranjan.app.NewsFeed.impl;

import java.util.ArrayList;
import java.util.List;

import com.ranjan.app.NewsFeed.NewsFeedDispatch;
import com.ranjan.app.NewsFeedObservers.NewsFeedProcessor;
import com.ranjan.app.NewsFeedObservers.impl.EmailNewsFeedProcessor;
import com.ranjan.app.NewsFeedObservers.impl.MobileNewsFeedProcessor;
import com.ranjan.app.NewsFeedObservers.impl.WebNewsFeedProcessor;

public class NewsFeedDispatchImpl implements NewsFeedDispatch{

    List<NewsFeedProcessor> newsProcessors;

    public NewsFeedDispatchImpl(){
        newsProcessors=new ArrayList<>();
        registerProcessors();
    }

    @Override
    public void registerProcessors() {
        newsProcessors.add(new EmailNewsFeedProcessor());
        newsProcessors.add(new MobileNewsFeedProcessor());
        newsProcessors.add(new WebNewsFeedProcessor());
    }

    @Override
    public void notifyProcessors(String msg) {
        for(NewsFeedProcessor processor:newsProcessors){
            processor.process(msg);
        }
    }

    @Override
    public void removeProcessors() {
        newsProcessors.removeAll(newsProcessors);
    }

    @Override
    public void recieveNews(String message) {
        notifyProcessors(message);
    }
    
}
