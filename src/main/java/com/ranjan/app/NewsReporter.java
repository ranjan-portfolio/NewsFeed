package com.ranjan.app;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.ranjan.app.NewsFeed.NewsFeedDispatch;
import com.ranjan.app.NewsFeed.impl.NewsFeedDispatchImpl;

public class NewsReporter {
    public static void main(String[] args) {
        String template="Hey Beautifule people Today %s is a sunny day Enjoy";
        LocalDate date= LocalDate.now();
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String today=date.format(dateTimeFormatter);
        String message=String.format(template, today);
        NewsFeedDispatch newsFeedDispatch=new NewsFeedDispatchImpl();
        newsFeedDispatch.recieveNews(message);
    }
}
