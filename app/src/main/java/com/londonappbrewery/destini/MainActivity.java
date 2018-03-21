package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button mtopButton;
    Button mbottomButton;
    TextView mstoryView;

    int mLevel = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mstoryView = (TextView) findViewById(R.id.storyTextView);
        mtopButton = (Button) findViewById(R.id.buttonTop);
        mbottomButton = (Button) findViewById(R.id.buttonBottom);

        mstoryView.setText(R.string.T1_Story);
        mtopButton.setText(R.string.T1_Ans1);
        mbottomButton.setText(R.string.T1_Ans2);
        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mtopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Top Button", "Top Button tapped");
                if (mLevel == 1 || mLevel == 2){
                    mstoryView.setText(R.string.T3_Story);
                    mtopButton.setText(R.string.T3_Ans1);
                    mbottomButton.setText(R.string.T3_Ans2);
                    mLevel = 3;
                }else {
                    mstoryView.setText(R.string.T6_End);
                    mtopButton.setVisibility(View.GONE);
                    mbottomButton.setVisibility(View.GONE);

                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mbottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Bottom Button", "Bottom Button tapped");
                if (mLevel == 1){
                    mstoryView.setText(R.string.T2_Story);
                    mtopButton.setText(R.string.T2_Ans1);
                    mbottomButton.setText(R.string.T2_Ans2);
                    mLevel = 2;
                }else if(mLevel == 2){
                    mstoryView.setText(R.string.T4_End);
                    mtopButton.setVisibility(View.GONE);
                    mbottomButton.setVisibility(View.GONE);
                }else{
                    mstoryView.setText(R.string.T5_End);
                    mtopButton.setVisibility(View.GONE);
                    mbottomButton.setVisibility(View.GONE);

                }
            }
        });
    }

}
