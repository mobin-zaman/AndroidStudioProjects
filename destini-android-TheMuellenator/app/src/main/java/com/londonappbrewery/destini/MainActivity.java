package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView story;
    private Button red_button;
    private Button blue_button;
    private int story_index=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        story=(TextView) findViewById(R.id.storyTextView);
        red_button=(Button) findViewById(R.id.buttonTop);
        blue_button=(Button) findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        red_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(story_index==1) {
                    story.setText(R.string.T3_Story);
                    red_button.setText(R.string.T3_Ans1);
                    blue_button.setText(R.string.T3_Ans2);
                } else if(story_index==3){

                }

            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        blue_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(story_index==1) {
                    story.setText(R.string.T2_Story);
                    red_button.setText(R.string.T2_Ans1);
                    blue_button.setText(R.string.T2_Ans2);
                    story_index = 2;
                }

                else if(story_index==2){
                    story.setText(R.string.T4_End);
                    red_button.setVisibility(View.GONE);
                    blue_button.setVisibility(View.GONE);
                }

            }
        });


    }
}
