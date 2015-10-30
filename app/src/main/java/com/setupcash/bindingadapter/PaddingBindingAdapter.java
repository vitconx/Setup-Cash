package com.setupcash.bindingadapter;

import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.EditText;

/**
 * Created by HieuVP on 8/1/2015.
 */
public class PaddingBindingAdapter {

    @BindingAdapter("bind:screen_padding")
    public static void setScreenPadding(View view, double percent) {
        int width = BindingAdapterUtils.getScreenWidth(view.getContext());
        int value = (int) (width * percent / 100);
        view.setPadding(value, value, value, value);
    }

    @BindingAdapter("bind:screen_paddingTop")
    public static void setScreenPaddingTop(View view, double percent) {
        int height = BindingAdapterUtils.getScreenHeight(view.getContext());
        int value = (int) (height * percent / 100);
        view.setPadding(view.getPaddingLeft(), value, view.getPaddingRight(), view.getPaddingBottom());
    }

    @BindingAdapter("bind:screen_paddingBottom")
    public static void setScreenPaddingBottom(View view, double percent) {
        int height = BindingAdapterUtils.getScreenHeight(view.getContext());
        int value = (int) (height * percent / 100);
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), value);
    }

    @BindingAdapter("bind:screen_paddingLeft")
    public static void setScreenPaddingLeft(View view, double percent) {
        int width = BindingAdapterUtils.getScreenWidth(view.getContext());
        int value = (int) (width * percent / 100);
        view.setPadding(value, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
    }

    @BindingAdapter("bind:screen_paddingRight")
    public static void setScreenPaddingRight(View view, double percent) {
        int width = BindingAdapterUtils.getScreenWidth(view.getContext());
        int value = (int) (width * percent / 100);
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), value, view.getPaddingBottom());
    }

    @BindingAdapter("bind:padding_start")
    public static void setPaddingStart(View view, int value) {
        view.setPadding(value, 0, 0, 0);
    }

    @BindingAdapter("bind:padding_end")
    public static void setPaddingEnd(View view, int value) {
        view.setPadding(0, 0, value, 0);
    }

    @BindingAdapter("bind:screen_drawablePadding")
    public static void setScreenDrawablePadding(EditText view, double percent) {
        int width = BindingAdapterUtils.getScreenWidth(view.getContext());
        int value = (int) (width * percent / 100);
        view.setCompoundDrawablePadding(value);
    }
}
