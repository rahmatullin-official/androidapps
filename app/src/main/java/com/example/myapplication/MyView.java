package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class MyView extends View {

    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        int y = 0, x = 0;
        while (x < canvas.getWidth() * 30) {
            canvas.drawLine(0, y,
                    x, -y, paint);
            x += 30;
            y += 30;
        }
    }
}