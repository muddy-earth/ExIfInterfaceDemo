package com.example.overtatech_4.exifinterfacedemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by overtatech-4 on 16/2/17.
 */

public class MyCurvedTextView extends TextView {


    public MyCurvedTextView(Context context) {
        super(context);
    }

    public MyCurvedTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyCurvedTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint=new Paint();
        paint.setTextSize(90);
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextAlign(Paint.Align.CENTER);

        Path mPath = new Path();
        //mPath.moveTo(canvas.getWidth()/2,(canvas.getHeight()/2)+300);
        //mPath.addCircle(canvas.getWidth()/2, canvas.getHeight()/2, 300, Path.Direction.CW);

        mPath.addArc(200, 200, 600, 900,180,180);
        //canvas.rotate(90);
        canvas.drawPath(mPath,paint);
        //canvas.rotate(90);
       // canvas.drawCircle();
        canvas.drawTextOnPath("Hello World", mPath, 0, 0, paint);
    }
}
