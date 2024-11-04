package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ls extends ViewGroup.MarginLayoutParams {
    public mh c;
    public final Rect d;
    public boolean e;
    boolean f;

    public ls(int i, int i2) {
        super(i, i2);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public final int cB() {
        return this.c.b();
    }

    public final boolean cC() {
        return this.c.v();
    }

    public final boolean cD() {
        return this.c.s();
    }

    public ls(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public ls(ls lsVar) {
        super((ViewGroup.LayoutParams) lsVar);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public ls(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public ls(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }
}
