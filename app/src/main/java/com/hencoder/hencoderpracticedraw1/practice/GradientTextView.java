package com.hencoder.hencoderpracticedraw1.practice;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by domain on 2018-08-01.
 * Email:sunlongyue@foxmail.com
 * describe:
 */

@SuppressLint("AppCompatCustomView")
public class GradientTextView extends TextView {

    private Paint mPaint;
    private float mTextWidth = 0;
    private int mTextHeight = 0;
    private Rect mTextBound = new Rect();

    public GradientTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        mPaint = getPaint();
        String mTipText = getText().toString();
        mPaint.getTextBounds(mTipText, 0, mTipText.length(), mTextBound);

        mTextWidth = mTextBound.width();
        mTextHeight = mTextBound.height(); // 使用 getTextBounds() 计算出来的高度

        Log.e("text1", "width:" + mTextWidth + "height:" + mTextHeight);
        Shader shader = new LinearGradient(0, mTextHeight / 2, mTextWidth, mTextHeight / 2 + 30, Color.parseColor("#3c8bf6"),
                Color.parseColor("#5eb9f3"), Shader.TileMode.CLAMP);
        mPaint.setShader(shader);

//        canvas.drawRect(0,60,mTextWidth,mTextHeight+60,mPaint);
//        canvas.setMatrix(getMatrix());
//        canvas.drawText(mTipText, getMeasuredWidth() / 2 - mTextBound.width() / 2, getMeasuredHeight() / 2 +   mTextBound.height()/2, mPaint);


        Log.e("text", "width:" + (getMeasuredWidth() / 2 - mTextBound.width() / 2) + "height:" + (getMeasuredHeight() / 2 + mTextBound.height() / 2));
        Log.e("text", "width:" + mTextWidth + "height:" + mTextHeight);

        canvas.drawText(mTipText, 0, mTextHeight, mPaint);
    }
}