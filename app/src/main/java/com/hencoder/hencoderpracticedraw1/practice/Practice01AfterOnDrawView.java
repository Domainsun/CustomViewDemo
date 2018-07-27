package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

import com.hencoder.hencoderpracticedraw1.R;


public class Practice01AfterOnDrawView extends AppCompatImageView {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice01AfterOnDrawView(Context context) {
        super(context);
    }

    public Practice01AfterOnDrawView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice01AfterOnDrawView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        paint.setColor(Color.parseColor("#FFC107"));
        paint.setTextSize(28);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // 在 super.onDraw() 的下方插入绘制代码，让绘制内容盖住原主体内容
        // 由于这期的重点是绘制代码的位置而不是绘制代码本身，所以直接给出绘制代码，你只要解除注释就好
        // 爽吧？

        Drawable drawable = getDrawable();
        if (drawable != null) {
            canvas.save();
            canvas.concat(getImageMatrix()); //在缩放的图片上加标点
            Rect bounds = drawable.getBounds();
            canvas.drawText(getResources().getString(R.string.image_size, bounds.width(), bounds.height()), 20, 40, paint);
            paint.setColor(Color.WHITE);
            paint.setStyle(Paint.Style.STROKE);
            PathEffect pathEffect = new DashPathEffect(new float[]{20, 10, 5, 10}, 0); //参数:第一个数组是 画线长度和空白长度两个为一对。 第二个参数为偏移量
            paint.setPathEffect(pathEffect);
            canvas.drawCircle(bounds.width()/2,bounds.height()/2,100,paint);
            canvas.restore();
        }
    }
}