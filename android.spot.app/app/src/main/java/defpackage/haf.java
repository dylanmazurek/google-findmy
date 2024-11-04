package defpackage;

import android.content.res.Resources;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class haf {
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    public haf(Resources resources) {
        this.a = resources.getDimensionPixelSize(R.dimen.og_apd_large_ring_width);
        this.b = resources.getDimensionPixelSize(R.dimen.og_apd_small_ring_width);
        this.c = resources.getDimensionPixelSize(R.dimen.og_apd_min_avatar_size_for_large_ring);
        this.d = resources.getDimensionPixelSize(R.dimen.og_apd_max_avatar_size_for_small_ring);
    }

    private final float e(int i, int i2, int i3) {
        int i4;
        if (i >= i2) {
            i4 = this.a;
        } else if (i <= i3) {
            i4 = this.b;
        } else {
            return this.b + ((this.a - r0) * ((i - i3) / (i2 - i3)));
        }
        return i4;
    }

    private final float f(int i) {
        return e(i, this.c, this.d);
    }

    public final float a(int i) {
        return e(i, c(this.c), c(this.d));
    }

    public final int b(int i) {
        return (i - Math.round(a(i) * 4.0f)) - 2;
    }

    public final int c(int i) {
        return i + Math.round(f(i) * 4.0f) + 2;
    }

    public final int d(int i) {
        return Math.round(f(i));
    }
}
