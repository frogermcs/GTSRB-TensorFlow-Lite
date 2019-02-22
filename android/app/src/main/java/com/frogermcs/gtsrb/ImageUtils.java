package com.frogermcs.gtsrb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

public class ImageUtils {
    /**
     * Make bitmap appropriate size for used model (224x224x). 
     * We don't do any preprocessing, because training dataset didn't have any...
     */
    public static Bitmap prepareImageForClassification(Bitmap bitmap) {
        Paint paint = new Paint();
        Bitmap finalBitmap = Bitmap.createScaledBitmap(
                bitmap,
                GtsrbModelConfig.INPUT_IMG_SIZE_WIDTH,
                GtsrbModelConfig.INPUT_IMG_SIZE_HEIGHT,
                false);
        Canvas canvas = new Canvas(finalBitmap);
        canvas.drawBitmap(finalBitmap, 0, 0, paint);
        return finalBitmap;
    }
}
