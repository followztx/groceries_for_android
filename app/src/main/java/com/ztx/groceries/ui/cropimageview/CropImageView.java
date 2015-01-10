package com.ztx.groceries.ui.cropimageview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * implement customCropMatrix() method,and define youself MATRIX for crop;
 * Created by Administrator on 2015/1/11.
 */
public abstract class CropImageView extends ImageView{
    public CropImageView(Context context) {
        super(context);
        setScaleType(ScaleType.MATRIX);
    }

    public CropImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setScaleType(ScaleType.MATRIX);
    }

    public CropImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setScaleType(ScaleType.MATRIX);
    }

    @Override
    protected boolean setFrame(int l, int t, int r, int b) {
        customCropMatrix();
        return super.setFrame(l, t, r, b);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        customCropMatrix();
    }

    /**
     * here you can define custom Matrix for ImageView crop,eg TopCrop
     *  Matrix matrix = getImageMatrix();
     *
     *  float scaleFactor = getWidth() / (float) getDrawable().getIntrinsicWidth();
     *  matrix.setScale(scaleFactor, scaleFactor, 0, 0);
     *
     *  setImageMatrix(matrix);
     */
    public abstract void customCropMatrix();
}
