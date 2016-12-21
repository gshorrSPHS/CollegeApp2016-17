package com.mistershorr.collegeapp.Presenter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import com.mistershorr.collegeapp.R;

/**
 * Created by gshorr on 12/15/16.
 */
public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

//Remove notification bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash);

        //countdown timer to an intent to login later

        Button submit = (Button) findViewById(R.id.button);
        final EditText editText = (EditText) findViewById(R.id.editText);
        submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                editText.setError("D'OH!");
            }
        });
    }
}
