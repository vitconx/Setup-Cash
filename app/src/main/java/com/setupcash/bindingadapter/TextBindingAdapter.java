package com.setupcash.bindingadapter;

import android.databinding.BindingAdapter;
import android.text.Html;
import android.util.TypedValue;
import android.widget.TextView;

/**
 * Created by HieuVP on 8/1/2015.
 */
public class TextBindingAdapter {

    @BindingAdapter("binding:screen_textSizeOnWidth")
    public static void setScreenTextSizeOnWidth(TextView view, double percent) {
        int width = BindingAdapterUtils.getScreenWidth(view.getContext());
        view.setTextSize(TypedValue.COMPLEX_UNIT_PX,
                (float) ((float) width * percent / 100));
    }

    @BindingAdapter("binding:screen_textSizeOnHeight")
    public static void setScreenTextSizeOnHeight(TextView view, double percent) {
        int height = BindingAdapterUtils.getScreenHeight(view.getContext());
        view.setTextSize(TypedValue.COMPLEX_UNIT_PX,
                (float) ((float) height * percent / 100));
    }

    @BindingAdapter("binding:html")
    public static void setHtml(TextView view, String string) {
        view.setText(Html.fromHtml(string));
    }
}
