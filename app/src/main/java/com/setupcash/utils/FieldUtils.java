package com.setupcash.utils;

import java.lang.reflect.Field;

/**
 * Created by HieuVP on 7/27/2015.
 */
public class FieldUtils {

    public static void set(Object object, String fieldName, Object value) {
        Class<?> aClass = object.getClass();
        set(aClass, object, fieldName, value);
    }

    private static void set(Class<?> aClass, Object object, String fieldName, Object value) {
        try {
            Field field = aClass.getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(object, value);
        } catch (NoSuchFieldException e) {
            Class<?> superclass = aClass.getSuperclass();
            if (superclass == Object.class) {
                throw new RuntimeException(e);
            }
            set(superclass, object, fieldName, value);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
