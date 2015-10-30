package com.setupcash.main;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.setupcash.R;
import com.setupcash.home.HomeFragment;
import com.setupcash.login.LoginFragment;

/**
 * Created by HieuVP on 10/30/2015.
 */
public class MainActivity extends AppCompatActivity {
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FacebookSdk.sdkInitialize(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        fragmentManager = getSupportFragmentManager();
        replaceLoginFragment();
    }

    @Override
    protected void onResume() {
        super.onResume();
        AppEventsLogger.activateApp(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        AppEventsLogger.deactivateApp(this);
    }

    public void replaceLoginFragment() {
        Fragment fragment = new LoginFragment();
        fragmentManager.beginTransaction()
                .replace(R.id.fl_main, fragment, LoginFragment.TAG_NAME)
                .commit();
    }

    public void replaceHomeFragment() {
        Fragment fragment = new HomeFragment();
        fragmentManager.beginTransaction()
                .replace(R.id.fl_main, fragment, HomeFragment.TAG_NAME)
                .commit();
    }
}
