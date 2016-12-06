package com.example.vulan.threadhandling.entity;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.vulan.threadhandling.R;

/**
 * Created by vulan on 06/12/2016.
 */

public class BallObject extends RelativeLayout {

    private int mValue;
    private TextView mTextView;

    public BallObject(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public BallObject(Context context) {
        super(context);
        init(context);
    }

    public void init(Context context) {
        View.inflate(context, R.layout.item_ball, this);
        findView();
    }

    public void findView() {
        mTextView = (TextView) findViewById(R.id.image_ball);
    }

    public void setBackground() {
        mTextView.setText(""+mValue);
    }

    public int getValue() {
        return mValue;
    }

    public void setValue(int value) {
        mValue = value;
    }
}
