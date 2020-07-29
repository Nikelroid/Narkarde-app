package com.narkadeh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String esm;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button y=findViewById(R.id.yes);
        final Button n=findViewById(R.id.no);
        final Button b=findViewById(R.id.ok);
        final Button bh=findViewById(R.id.behradb);
        n.setVisibility(View.GONE);
        y.setVisibility(View.GONE);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer player = MediaPlayer.create(MainActivity.this, R.raw.click);
                player.setLooping(false); // Set looping
                player.setVolume(100,100);
                player.start();
                final EditText Esm = (EditText) findViewById(R.id.esm);
                final String str = Esm.getText().toString();
                TextView tv_text=findViewById(R.id.bhrd);
                tv_text.setText(str+" کیر میخوری؟");
                b.setVisibility(View.GONE);
                y.setVisibility(View.VISIBLE);
                n.setVisibility(View.VISIBLE);
            }
        });
        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer player = MediaPlayer.create(MainActivity.this, R.raw.click);
                player.setLooping(false); // Set looping
                player.setVolume(100,100);
                player.start();
                ImageView img = (ImageView) findViewById(R.id.imageView);
                img.setImageResource(R.mipmap.happy);

                Toast.makeText(getApplicationContext(), "ایول خیلی مردی =))))",
                        Toast.LENGTH_SHORT).show();
            }
        });
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer player = MediaPlayer.create(MainActivity.this, R.raw.click);
                player.setLooping(false); // Set looping
                player.setVolume(100,100);
                player.start();
                ImageView img = (ImageView) findViewById(R.id.imageView);
                img.setImageResource(R.mipmap.sad);

                Toast.makeText(getApplicationContext(), "عه کیر تو کونت ;((((",
                        Toast.LENGTH_SHORT).show();
            }
        });
        bh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, behead.class));
            }
        });
            }
        }


