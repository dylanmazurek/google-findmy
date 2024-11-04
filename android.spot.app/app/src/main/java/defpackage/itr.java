package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class itr extends itf {
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final boolean o;

    public itr(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        TypedArray a = isa.a(context, attributeSet, iul.b, i, i2, new int[0]);
        this.k = a.getInt(0, 0);
        int h = hzc.h(context, a, 4, dimensionPixelSize);
        int i3 = this.a;
        this.l = Math.max(h, i3 + i3);
        this.m = hzc.h(context, a, 3, dimensionPixelSize2);
        this.n = a.getInt(2, 0);
        this.o = a.getBoolean(1, true);
        a.recycle();
        a();
    }
}
