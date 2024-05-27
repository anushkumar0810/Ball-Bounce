package com.example.ballbounce;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Ball {

    private int x;
    private int y;
    private int radius;
    private int dx = 20;
    private int dy = 20;
    private Paint paint;

    public Ball(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        paint = new Paint();
        paint.setColor(Color.BLUE);
    }

    public void update(int width, int height) {
        x += dx;
        y += dy;
        if ((x - radius) < 0 || (x + radius) > width) {
            dx = -dx;
        }
        if ((y - radius) < 0 || (y + radius) > height) {
            dy = -dy;
        }
    }

    public void draw(Canvas canvas) {
        canvas.drawCircle(x, y, radius, paint);
    }
}
