package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hzt {
    private Object a;
    private WeakReference b;
    private boolean c = false;
    private boolean d = true;

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized Object a() {
        Paint paint;
        if (!this.c) {
            this.c = true;
            if (ijs.g()) {
                hzu.a.add(this);
                int i = hzu.b;
                if (i != -1) {
                    b(i);
                }
            } else {
                ijs.e(new hsi(this, 18));
            }
        }
        Object obj = this.a;
        if (obj != null) {
            return obj;
        }
        WeakReference weakReference = this.b;
        if (weakReference == null) {
            paint = 0;
        } else {
            paint = weakReference.get();
        }
        if (paint == 0) {
            paint = new Paint();
            paint.setAntiAlias(true);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.SANS_SERIF, 0));
            if (this.d) {
                this.a = paint;
                this.b = null;
            } else {
                this.b = new WeakReference(paint);
            }
        }
        return paint;
    }

    public final synchronized void b(int i) {
        boolean z;
        Object obj;
        if (i < 20) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.d) {
            this.d = z;
            if (z) {
                if (this.a == null) {
                    WeakReference weakReference = this.b;
                    if (weakReference == null) {
                        obj = null;
                    } else {
                        obj = weakReference.get();
                    }
                    if (obj != null) {
                        this.a = obj;
                    } else {
                        this.b = null;
                    }
                }
            } else {
                Object obj2 = this.a;
                if (obj2 != null) {
                    this.b = new WeakReference(obj2);
                    this.a = null;
                }
            }
        }
    }
}
