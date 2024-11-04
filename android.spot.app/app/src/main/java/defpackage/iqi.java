package defpackage;

import android.content.Context;
import android.graphics.Color;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iqi {
    private static final int c = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    private final int d;
    private final int e;
    private final float f;

    public iqi(boolean z, int i, int i2, int i3, float f) {
        this.a = z;
        this.d = i;
        this.e = i2;
        this.b = i3;
        this.f = f;
    }

    public final int a(int i, float f) {
        float f2;
        int i2;
        if (this.f > 0.0f && f > 0.0f) {
            f2 = Math.min(((((float) Math.log1p(f / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        } else {
            f2 = 0.0f;
        }
        int alpha = Color.alpha(i);
        int f3 = iqg.f(bro.c(i, 255), this.d, f2);
        if (f2 > 0.0f && (i2 = this.e) != 0) {
            f3 = bro.b(bro.c(i2, c), f3);
        }
        return bro.c(f3, alpha);
    }

    public final int b(int i, float f) {
        if (this.a && bro.c(i, 255) == this.b) {
            return a(i, f);
        }
        return i;
    }

    public iqi(Context context) {
        this(hzc.q(context, R.attr.elevationOverlayEnabled, false), iqg.d(context, R.attr.elevationOverlayColor, 0), iqg.d(context, R.attr.elevationOverlayAccentColor, 0), iqg.d(context, R.attr.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }
}
