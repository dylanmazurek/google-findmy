package defpackage;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* compiled from: PG */
/* loaded from: classes.dex */
class ig {
    private static final int[] b = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public Bitmap a;
    private final ProgressBar c;

    public ig(ProgressBar progressBar) {
        this.c = progressBar;
    }

    final Drawable a(Drawable drawable, boolean z) {
        int layerGravity;
        int layerWidth;
        int layerHeight;
        int layerInsetLeft;
        int layerInsetRight;
        int layerInsetTop;
        int layerInsetBottom;
        int layerInsetStart;
        int layerInsetEnd;
        boolean z2;
        if (drawable instanceof bsj) {
            bsj bsjVar = (bsj) drawable;
            Drawable drawable2 = bsjVar.c;
            if (drawable2 != null) {
                bsjVar.a(a(drawable2, z));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    Drawable drawable3 = layerDrawable.getDrawable(i);
                    if (id != 16908301 && id != 16908303) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    drawableArr[i] = a(drawable3, z2);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                    if (Build.VERSION.SDK_INT >= 23) {
                        layerGravity = layerDrawable.getLayerGravity(i2);
                        layerDrawable2.setLayerGravity(i2, layerGravity);
                        layerWidth = layerDrawable.getLayerWidth(i2);
                        layerDrawable2.setLayerWidth(i2, layerWidth);
                        layerHeight = layerDrawable.getLayerHeight(i2);
                        layerDrawable2.setLayerHeight(i2, layerHeight);
                        layerInsetLeft = layerDrawable.getLayerInsetLeft(i2);
                        layerDrawable2.setLayerInsetLeft(i2, layerInsetLeft);
                        layerInsetRight = layerDrawable.getLayerInsetRight(i2);
                        layerDrawable2.setLayerInsetRight(i2, layerInsetRight);
                        layerInsetTop = layerDrawable.getLayerInsetTop(i2);
                        layerDrawable2.setLayerInsetTop(i2, layerInsetTop);
                        layerInsetBottom = layerDrawable.getLayerInsetBottom(i2);
                        layerDrawable2.setLayerInsetBottom(i2, layerInsetBottom);
                        layerInsetStart = layerDrawable.getLayerInsetStart(i2);
                        layerDrawable2.setLayerInsetStart(i2, layerInsetStart);
                        layerInsetEnd = layerDrawable.getLayerInsetEnd(i2);
                        layerDrawable2.setLayerInsetEnd(i2, layerInsetEnd);
                    }
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.a == null) {
                    this.a = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                if (z) {
                    return new ClipDrawable(shapeDrawable, 3, 1);
                }
                return shapeDrawable;
            }
        }
        return drawable;
    }

    public void b(AttributeSet attributeSet, int i) {
        ksr F = ksr.F(this.c.getContext(), attributeSet, b, i, 0);
        Drawable v = F.v(0);
        if (v != null) {
            ProgressBar progressBar = this.c;
            if (v instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) v;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable a = a(animationDrawable.getFrame(i2), true);
                    a.setLevel(10000);
                    animationDrawable2.addFrame(a, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                v = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(v);
        }
        Drawable v2 = F.v(1);
        if (v2 != null) {
            this.c.setProgressDrawable(a(v2, false));
        }
        F.y();
    }
}
