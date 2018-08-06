package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;

public class Practice02BeforeOnDrawView extends AppCompatTextView {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    RectF bounds = new RectF();

    public Practice02BeforeOnDrawView(Context context) {
        super(context);
    }

    public Practice02BeforeOnDrawView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice02BeforeOnDrawView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        paint.setColor(Color.parseColor("#FFC107"));
//        Shader shader = new LinearGradient(100, 100, 500, 500, Color.parseColor("#ffffff"),
//                Color.parseColor("#000000"), Shader.TileMode.CLAMP);
//        paint.setShader(shader);
    }

    @Override
    protected void onDraw(Canvas canvas) {

//
//         把下面的绘制代码移到 super.onDraw() 的上面，就可以让原主体内容盖住你的绘制代码了  //结果会是先绘制我们下面写的代码，再去绘制父类里面text
//         （或者你也可以把 super.onDraw() 移到这段代码的下面）
        Layout layout = getLayout();
        bounds.left = layout.getLineLeft(1);
        bounds.right = layout.getLineRight(1);
        bounds.top = layout.getLineTop(1);
        bounds.bottom = layout.getLineBottom(1);
        canvas.drawRect(bounds, paint);
        bounds.left = layout.getLineLeft(layout.getLineCount() - 3);
        bounds.right = layout.getLineRight(layout.getLineCount() - 3);
        bounds.top = layout.getLineTop(layout.getLineCount() - 3);
        bounds.bottom = layout.getLineBottom(layout.getLineCount() - 3);
        canvas.drawRect(bounds, paint);
        super.onDraw(canvas);


//        String text = getText().toString();
//        //获取字体的宽度
//        Rect rect = new Rect();
//        paint.getTextBounds(text, 0, text.length(), rect);
//        paint.setTextSize(this.getTextSize());
//        int x = getWidth() / 2 - rect.width() / 2;
//        //基线
//        Paint.FontMetricsInt metricsInt = paint.getFontMetricsInt();
//        int dy = (metricsInt.bottom - metricsInt.top) / 2 - metricsInt.bottom;
//        int baseLine = getHeight() / 2 + dy;
//        canvas.drawText(text, x, baseLine, paint);


//        TextPaint textPaint=new TextPaint();
//        textPaint.setTextSize(getTextSize());
//        Shader shader = new LinearGradient(100, 100, 500, 500, Color.parseColor("##3c8bf6 "),
//                Color.parseColor("#5eb9f3"), Shader.TileMode.CLAMP);
//        textPaint.setShader(shader);
//        StaticLayout staticLayout2 = new StaticLayout(text, textPaint, 600,
//                Layout.Alignment.ALIGN_NORMAL, 1, 0, true);
//        staticLayout2.draw(canvas);
//        super.onDraw(canvas);
    }
}
