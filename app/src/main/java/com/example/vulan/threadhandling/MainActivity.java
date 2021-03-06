package com.example.vulan.threadhandling;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;

import com.example.vulan.threadhandling.animation.CircularAnimation;
import com.example.vulan.threadhandling.entity.BallObject;

public class MainActivity extends AppCompatActivity {

    private BallObject[] mListBall = new BallObject[6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
        init();
    }

    private void findView() {
        mListBall[0] = (BallObject) findViewById(R.id.ball_0);
        mListBall[1] = (BallObject) findViewById(R.id.ball_1);
        mListBall[2] = (BallObject) findViewById(R.id.ball_2);
        mListBall[3] = (BallObject) findViewById(R.id.ball_3);
        mListBall[4] = (BallObject) findViewById(R.id.ball_4);
        mListBall[5] = (BallObject) findViewById(R.id.ball_5);
    }

    private void init() {
        for (int i = 0; i < 6; i++) {
            mListBall[i].setValue(i);
            mListBall[i].setBackground();
        }
        mListBall[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = new CircularAnimation(mListBall[0], 100);
                animation.setDuration(3000);
                mListBall[0].startAnimation(animation);
            }
        });
    }

    private void doBuble_Sort() {
        int size = mListBall.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = size - 1; j > i; j--) {
                if (mListBall[j].getValue() > mListBall[j - 1].getValue()) {

                }
            }
        }
    }


}
