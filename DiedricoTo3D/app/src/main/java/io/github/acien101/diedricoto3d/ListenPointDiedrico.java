package io.github.acien101.diedricoto3d;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.widget.ImageView;

/**
 * Created by amil101 on 21/02/16.
 */
public class ListenPointDiedrico {
    public ListenPointDiedrico(ImageView imageView, Bitmap pic, PuntoDiedrico puntoDiedrico){
        Bitmap transformation = pic;

        Paint paintMax;
        paintMax = new Paint();
        paintMax.setColor(Color.YELLOW);
        paintMax.setStyle(Paint.Style.FILL);

        Canvas canvas = new Canvas(transformation);

        canvas.drawCircle((float) puntoDiedrico.cota.getX(), (float) puntoDiedrico.cota.getY(), 3, paintMax);
        canvas.drawCircle((float) puntoDiedrico.alejamiento.getX(), (float) puntoDiedrico.alejamiento.getY(), 3, paintMax);


        imageView.setImageBitmap(transformation);
    }
}