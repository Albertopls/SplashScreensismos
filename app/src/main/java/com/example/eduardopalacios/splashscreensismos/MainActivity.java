package com.example.eduardopalacios.splashscreensismos;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.felipecsl.gifimageview.library.GifImageView;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;

public class MainActivity extends Activity {

    private GifImageView gif;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        gif=(GifImageView)findViewById(R.id.Gif);

        try {

            InputStream inputStream=getAssets().open("sismosgif.gif");
            byte[] bytes= IOUtils.toByteArray(inputStream);
            gif.setBytes(bytes);
            gif.startAnimation();
        } catch (IOException e) {
            e.printStackTrace();
        }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

              // MainActivity.this.startActivity(new Intent(MainActivity.this,Main2Activity.class));
                //MainActivity.this.finish();

            }
        },5200);
    }
}
