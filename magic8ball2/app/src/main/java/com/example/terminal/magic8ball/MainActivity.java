package com.example.terminal.magic8ball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button=(Button) findViewById(R.id.button);
        final ImageView imageView=(ImageView) findViewById(R.id.imageView);

        final int[] images={
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };

        final Random random=new Random();


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n=random.nextInt(5);
                imageView.setImageResource(images[n]);
            }
        });
    }
}



