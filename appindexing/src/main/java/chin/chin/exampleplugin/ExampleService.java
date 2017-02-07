package chin.chin.exampleplugin;

import android.app.Activity;
import android.util.Log;
import android.support.annotation.Keep;

public class ExampleService {

    private static final String TAG = "ExampleService";
    private static boolean Initialized = false;
    
    public static void Init(final Activity ctx, final String appKey) {
        if (Initialized) {
            return;
        }
        Initialized = true;
        if (ctx == null) {
            Log.wtf(TAG, "Capture() called with null context");
            return;
        }
        Log.d(TAG, "Init() called");
    }



}
