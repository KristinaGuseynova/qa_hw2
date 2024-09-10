package ru.cucumber;

public class Main {
    private static String msg = "Hello new barbie world!"
    public static void main(String[] args) {
        System.out.println(getMessage());
    }

    private static String getMessage() {
        return msg;
    }
}