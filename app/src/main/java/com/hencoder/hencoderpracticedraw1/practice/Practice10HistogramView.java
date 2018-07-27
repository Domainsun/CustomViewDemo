package com.hencoder.hencoderpracticedraw1.practice;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {


    Paint paint=new Paint();

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @SuppressLint("Range")
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        paint.setColor(Color.WHITE);
        paint.setTextSize(20);
        //先画x,y轴
          float points[]=new float[]{
            200,50, 200,500,200,500,1200,500
        };
        canvas.drawLines(points,paint);

//        canvas.drawLine(200,500,1200,500,paint);

        //画各项直方
        paint.setColor(Color.GREEN);
        canvas.drawRect(250,100,300,500,paint);
        canvas.drawText("froyo",275,550,paint);

        canvas.drawRect(350,400,400,500,paint);
        canvas.drawText("GB",375,550,paint);

        canvas.drawRect(450,300,500,500,paint);
        canvas.drawText("ICS",475,550,paint);

        canvas.drawRect(550,450,600,500,paint);
        canvas.drawText("JB",575,550,paint);

        canvas.drawRect(650,150,700,500,paint);
        canvas.drawText("KitKat",675,550,paint);

        canvas.drawRect(750,230,800,500,paint);
        canvas.drawText("L",775,550,paint);

        canvas.drawRect(850,110,900,500,paint);
        canvas.drawText("M",875,550,paint);

        canvas.drawText("直方图",600,600,paint);

    }
}
