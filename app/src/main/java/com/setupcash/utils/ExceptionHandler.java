package com.setupcash.utils;

/**
 * Created by HieuVP on 10/30/2015.
 */
public class ExceptionHandler {

    public static void show(Exception exception) {
        doThrow(exception);
    }

    public static void doThrow(Exception exception) {
        throw new RuntimeException(exception);
    }

    public static void doIgnore(Class<?> cls) {
        System.out.println("Ignored an Exception in " + cls.getSimpleName() + ".class");
    }
}
