package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ik extends SeekBar {
    private final il a;

    public ik(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        mx.d(this, getContext());
        il ilVar = new il(this);
        this.a = ilVar;
        ilVar.b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        il ilVar = this.a;
        Drawable drawable = ilVar.c;
        if (drawable != null && drawable.isStateful() && drawable.setState(ilVar.b.getDrawableState())) {
            ilVar.b.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a.c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected final synchronized void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        il ilVar = this.a;
        if (ilVar.c != null) {
            int max = ilVar.b.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = ilVar.c.getIntrinsicWidth();
                int intrinsicHeight = ilVar.c.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i = intrinsicWidth >> 1;
                } else {
                    i = 1;
                }
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight >> 1;
                }
                ilVar.c.setBounds(-i, -i2, i, i2);
                int width = (ilVar.b.getWidth() - ilVar.b.getPaddingLeft()) - ilVar.b.getPaddingRight();
                int save = canvas.save();
                canvas.translate(ilVar.b.getPaddingLeft(), ilVar.b.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    ilVar.c.draw(canvas);
                    canvas.translate(width / max, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
