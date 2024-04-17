package com.example.git1;

public class Contributor {
    private String login;
    private int contributions;

    @Override
    public String toString() {
        return "                 " + login + ";" +  contributions;
    }
}
