package com.setupcash.utils;

import android.content.Context;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

import dalvik.system.DexFile;

/**
 * Created by HieuVP on 7/8/2015.
 */
public class ClassUtils {

    public static List<Class> getClasses(Context context, String packageName)
            throws IOException, ClassNotFoundException {
        List<Class> classes = new ArrayList<>();
        String packageCodePath = context.getPackageCodePath();
        DexFile file = new DexFile(packageCodePath);
        try {
            for (Enumeration<String> enumeration = file.entries(); enumeration.hasMoreElements(); ) {
                String className = enumeration.nextElement();
                if (className.startsWith(packageName)) {
                    classes.add(Class.forName(className));
                }
            }
        } catch (NullPointerException ignored) {
        }
        return classes;
    }

    public static List<Class> getClassesAnnotatedWith(Context context, String packageName,
                                                      Class<? extends Annotation> annotation)
            throws IOException, ClassNotFoundException {
        List<Class> classes = getClasses(context, packageName);
        for (Iterator<Class> iterator = classes.iterator(); iterator.hasNext(); ) {
            Class aClass = iterator.next();
            if (aClass.getAnnotation(annotation) == null) {
                iterator.remove();
            }
        }
        return classes;
    }
}
