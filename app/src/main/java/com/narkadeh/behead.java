package com.narkadeh;


 import android.media.MediaPlayer;
 import android.os.Bundle;
 import android.view.View;
 import android.widget.Button;
 import android.widget.Toast;


public class behead extends MainActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.behrad);

        final Button play=findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer player = MediaPlayer.create(behead.this, R.raw.behri);
                player.setLooping(false); // Set looping
                player.setVolume(100, 100);
                player.start();
            }
        });
        final Button rett=findViewById(R.id.ret);
        rett.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer player = MediaPlayer.create(behead.this, R.raw.click);
                player.setLooping(false); // Set looping
                player.setVolume(100, 100);
                player.start();
                Toast.makeText(getApplicationContext(), "کیر شدی :)) کونگشاد بازی در نیار دکمه ی back گوشیتو بزن !",
                        Toast.LENGTH_LONG).show();
            }
        });

    }
    }