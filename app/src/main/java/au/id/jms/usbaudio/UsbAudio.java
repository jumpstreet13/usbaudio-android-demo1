package au.id.jms.usbaudio;

public class UsbAudio {
    static {
        System.loadLibrary("usbaudio");
        //System.loadLibrary("usb-1.0");
    }

    public native boolean setup();
    public native void close();
    public native void loop();
    public native boolean stop();
    public native int measure();
}