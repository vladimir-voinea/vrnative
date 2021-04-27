package com.vmrfx.vrnativebridge;

public class VRNativeBridge {
    public static native void initialize();
    public static native void on_resize(int width, int height);
    public static native void render_frame();
}
