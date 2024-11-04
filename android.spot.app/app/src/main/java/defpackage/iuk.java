package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iuk extends itf {
    public final int k;
    public final int l;
    public boolean m;
    public int n;

    public iuk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        TypedArray a = isa.a(context, attributeSet, iul.c, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        this.k = a.getInt(0, 1);
        int i = a.getInt(1, 0);
        this.l = i;
        this.n = Math.min(a.getDimensionPixelSize(2, 0), this.a);
        a.recycle();
        a();
        this.m = i == 1;
    }

    @Override // defpackage.itf
    public final void a() {
        super.a();
        if (this.n >= 0) {
            if (this.k == 0) {
                if (this.b > 0 && this.g == 0) {
                    throw new IllegalArgumentException("Rounded corners without gap are not supported in contiguous indeterminate animation.");
                }
                if (this.c.length < 3) {
                    throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Stop indicator size must be >= 0.");
    }
}
