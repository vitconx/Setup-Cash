package com.setupcash.bindingadapter;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.DisplayMetrics;

/**
 * Created by HieuVP on 8/1/2015.
 */
public class BindingAdapterUtils {

    public static int getScreenWidth(Context context) {
        Activity activity = scanForActivity(context);
        return getScreenWidth(activity);
    }

    public static int getScreenHeight(Context context) {
        Activity activity = scanForActivity(context);
        return getScreenHeight(activity);
    }

    public static int getScreenWidth(Activity activity) {
        return getDisplayMetrics(activity).widthPixels;
    }

    public static int getScreenHeight(Activity activity) {
        return getDisplayMetrics(activity).heightPixels;
    }

    private static DisplayMetrics getDisplayMetrics(Activity activity) {
        DisplayMetrics metrics = new DisplayMetrics();
        activity.getWindowManager()
                .getDefaultDisplay()
                .getMetrics(metrics);
        return metrics;
    }

    public static Activity scanForActivity(Context context) {
        if (context == null) {
            return null;
        } else if (context instanceof Activity) {
            return (Activity) context;
        } else if (context instanceof ContextWrapper) {
            return scanForActivity(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }
}
