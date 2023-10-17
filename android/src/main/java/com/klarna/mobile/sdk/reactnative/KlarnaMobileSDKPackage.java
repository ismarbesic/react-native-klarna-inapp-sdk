package com.klarna.mobile.sdk.reactnative;

import android.app.Application;

import androidx.annotation.NonNull;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.klarna.mobile.sdk.reactnative.payments.KlarnaPaymentViewManager;
import com.klarna.mobile.sdk.reactnative.standalonewebview.KlarnaStandaloneWebViewManager;

import java.util.Collections;
import java.util.List;

public class KlarnaMobileSDKPackage implements ReactPackage {

    @NonNull
    @Override
    public List<NativeModule> createNativeModules(@NonNull ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }

    @NonNull
    @Override
    public List<ViewManager> createViewManagers(@NonNull ReactApplicationContext reactContext) {
        return List.of(
                new KlarnaPaymentViewManager(reactContext, (Application) reactContext.getApplicationContext()),
                new KlarnaStandaloneWebViewManager(reactContext, (Application) reactContext.getApplicationContext())
        );
    }
}
