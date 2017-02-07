package chin.chin.exampleplugin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class LandingActivity extends Activity {

    private int _timer = 100; //milliseconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        final Handler handler = new Handler();
//        handler.postDelayed(new Runnable() {
////            @Override
////            public void run() {
////                //StartGame();
////            }
////        }, _timer);
    }

    private void StartGame()
    {
        Intent intent = new Intent();
        String test = "com.unity3d.player.UnityPlayerProxyActivity";
        intent.setClassName(getApplicationContext(),test);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        getApplicationContext().startActivity(intent);
    }

}
