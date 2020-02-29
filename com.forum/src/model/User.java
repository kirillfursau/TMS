package model;

import lessons.lesson11.DateUtils;


public class User {
    private String name;
    private String message;
    private String dateUtils;

    public User(String name, String message, DateUtils dateUtils) {
        this.name = name;
        this.message = message;
        this.dateUtils = dateUtils.printNowDate();
    }

    public String getName() {
        return name;
    }


    public String getMessage() {
        return message;
    }

    public String getDateUtils() {
        return dateUtils;
    }
}
