package com.ztx.groceries.ui.cropimageview;

import android.content.Context;
import android.graphics.Matrix;
import android.util.AttributeSet;

public class TopCropImageView extends CropImageView {
    public TopCropImageView(Context context) {
        super(context);
    }

    public TopCropImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TopCropImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void customCropMatrix() {
        Matrix matrix = getImageMatrix();
        float scaleFactor = getWidth() / (float) getDrawable().getIntrinsicWidth();
        matrix.setScale(scaleFactor, scaleFactor, 0, 0);
        setImageMatrix(matrix);
    }
}
