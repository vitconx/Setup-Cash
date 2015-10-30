package com.setupcash.bindingadapter;

import android.databinding.BindingAdapter;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by HieuVP on 7/22/2015.
 */
public class LayoutBindingAdapter {

    @BindingAdapter("bind:layout_width")
    public static void setLayoutWidth(View view, int width) {
        ViewGroup.LayoutParams params = view.getLayoutParams();
        params.width = width;
        view.setLayoutParams(params);
    }

    @BindingAdapter("bind:layout_height")
    public static void setLayoutHeight(View view, int height) {
        ViewGroup.LayoutParams params = view.getLayoutParams();
        params.height = height;
        view.setLayoutParams(params);
    }

    @BindingAdapter("bind:screen_width")
    public static void setScreenWidth(View view, double percent) {
        int width = BindingAdapterUtils.getScreenWidth(view.getContext());
        ViewGroup.LayoutParams params = view.getLayoutParams();
        params.width = (int) (width * percent / 100);
        view.setLayoutParams(params);
    }

    @BindingAdapter("bind:screen_height")
    public static void setScreenHeight(View view, double percent) {
        int height = BindingAdapterUtils.getScreenHeight(view.getContext());
        ViewGroup.LayoutParams params = view.getLayoutParams();
        params.height = (int) (height * percent / 100);
        view.setLayoutParams(params);
    }

    @BindingAdapter("bind:screen_widthOnHeight")
    public static void setScreenWidthOnHeight(View view, double percent) {
        int height = BindingAdapterUtils.getScreenHeight(view.getContext());
        ViewGroup.LayoutParams params = view.getLayoutParams();
        params.width = (int) (height * percent / 100);
        view.setLayoutParams(params);
    }

    @BindingAdapter("bind:screen_heightOnWidth")
    public static void setScreenHeightOnWidth(View view, double percent) {
        int width = BindingAdapterUtils.getScreenWidth(view.getContext());
        ViewGroup.LayoutParams params = view.getLayoutParams();
        params.height = (int) (width * percent / 100);
        view.setLayoutParams(params);
    }
}
