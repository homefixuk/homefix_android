package com.homefix.tradesman.base.view;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.View;

import com.homefix.tradesman.base.HomeFixBaseActivity;

/**
 * Created by samuel on 5/30/2016.
 */

public interface BaseActivityView extends BaseView {

    void onResume();

    void onPause();

    void onDestroy();

    Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter);

    void unregisterReceiver(BroadcastReceiver receiver);

    void onBackPressed();

    boolean isFinishing();

    boolean isDestroyed();

    void onAppInstalled(String androidPackage);

    void onAppUninstalled(String androidPackage);

    HomeFixBaseActivity getBaseActivity();

    void onActivityResult(int requestCode, int resultCode, Intent data);

    void finishWithIntent(Intent data);

    void finishWithIntentAndAnimation(Intent data);

    void finishWithAnimation();

    void goToApp(boolean isUserNew, View logoView);

    View getLogoView();

    void onScrollingStarted();

    void onScrollingStopped();

}
