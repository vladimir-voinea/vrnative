package com.vmrfx.vrnativebridge;

import android.app.Activity;
import android.content.res.AssetManager;
import android.view.KeyEvent;
import android.view.MotionEvent;


public class VRNativeBridge {
    static
    {
        System.loadLibrary("vr-android-bridged");
    }

    public static native void initialize();
    public static native void on_resize(int width, int height);
    public static native void render_frame();

    public static native void set_activity(Activity activity);
    public static native void set_asset_manager(AssetManager manager);

    public static native void on_touch_event(MotionEvent event);
    public static native void on_key_event(KeyEvent event);
}
