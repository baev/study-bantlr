package ru.ifmo.sta.lab04.baev;

/**
* Generated by banler - Baev's ANother Tool for Language Recognition
*
* Saint Petersburg, 2013
* @author Dmitry Baev charlie@yandex-team.ru
*/
@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParseException extends Exception {
    private int position;
    private String message;

    public ParseException(String message, int position) {
        this.position = position;
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message + " \nPosition: " + position;
    }
}