package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lbs extends TextView {
    private int a;
    private int b;

    public lbs(Context context) {
        super(context);
        this.a = 0;
        this.b = 0;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.translate(this.b / 2, this.a / 2);
        super.draw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int max = Math.max(measuredWidth, measuredHeight);
        if (measuredWidth > measuredHeight) {
            this.a = measuredWidth - measuredHeight;
            this.b = 0;
        } else {
            this.a = 0;
            this.b = measuredHeight - measuredWidth;
        }
        setMeasuredDimension(max, max);
    }
}
