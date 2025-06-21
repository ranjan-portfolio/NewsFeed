package com.ranjan.app.NewsFeed;

public interface NewsFeedDispatch {
    
    public void registerProcessors();
    public void notifyProcessors(String msg);
    public void removeProcessors();
    public void recieveNews(String msg);
}
