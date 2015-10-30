package com.setupcash.bindingadapter;

import android.databinding.BindingAdapter;
import android.view.View;
import android.view.ViewGroup;

import com.setupcash.utils.FieldUtils;

/**
 * Created by HieuVP on 8/1/2015.
 */
public class MarginBindingAdapter {

    @BindingAdapter("bind:screen_marginTop")
    public static void setScreenMarginTop(View view, double percent) {
        int height = BindingAdapterUtils.getScreenHeight(view.getContext());
        ViewGroup.LayoutParams params = view.getLayoutParams();
        Integer value = (int) (height * percent / 100);
        FieldUtils.set(params, "topMargin", value);
        view.setLayoutParams(params);
    }

    @BindingAdapter("bind:screen_marginBottom")
    public static void setScreenMarginBottom(View view, double percent) {
        int height = BindingAdapterUtils.getScreenHeight(view.getContext());
        ViewGroup.LayoutParams params = view.getLayoutParams();
        Integer value = (int) (height * percent / 100);
        FieldUtils.set(params, "bottomMargin", value);
        view.setLayoutParams(params);
    }

    @BindingAdapter("bind:screen_marginLeft")
    public static void setScreenMarginLeft(View view, double percent) {
        int width = BindingAdapterUtils.getScreenWidth(view.getContext());
        ViewGroup.LayoutParams params = view.getLayoutParams();
        Integer value = (int) (width * percent / 100);
        FieldUtils.set(params, "leftMargin", value);
        view.setLayoutParams(params);
    }

    @BindingAdapter("bind:screen_marginRight")
    public static void setScreenMarginRight(View view, double percent) {
        int width = BindingAdapterUtils.getScreenWidth(view.getContext());
        ViewGroup.LayoutParams params = view.getLayoutParams();
        Integer value = (int) (width * percent / 100);
        FieldUtils.set(params, "rightMargin", value);
        view.setLayoutParams(params);
    }
}
