package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cf extends ViewGroup.MarginLayoutParams {
    public int a;

    public cf() {
        super(-2, -2);
        this.a = 8388627;
    }

    public cf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eb.b);
        this.a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public cf(cf cfVar) {
        super((ViewGroup.MarginLayoutParams) cfVar);
        this.a = 0;
        this.a = cfVar.a;
    }

    public cf(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }
}
