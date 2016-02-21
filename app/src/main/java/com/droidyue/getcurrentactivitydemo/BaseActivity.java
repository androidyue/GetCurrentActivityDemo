package com.droidyue.getcurrentactivitydemo;

import android.app.Activity;

/**
 * Created by androidyue on 2/9/16.
 */
public class BaseActivity extends Activity{

    @Override
    protected void onResume() {
        super.onResume();
        MyActivityManager.getInstance().setCurrentActivity(this);
    }
}
