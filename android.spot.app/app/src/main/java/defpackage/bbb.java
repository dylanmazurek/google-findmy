package defpackage;

import android.R;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbb {
    public static final void a(byn bynVar, bfh bfhVar) {
        if (b(bfhVar)) {
            bfe bfeVar = bfhVar.c;
            bfn bfnVar = bfd.a;
            if (((bev) bej.b(bfeVar, bfd.f)) != null) {
                bynVar.j(new byi(R.id.accessibilityActionSetProgress));
            }
        }
    }

    public static final boolean b(bfh bfhVar) {
        bfe e = bfhVar.e();
        bfn bfnVar = bfj.a;
        if (!e.d(bfj.i)) {
            return true;
        }
        return false;
    }

    public static final boolean c(bfh bfhVar) {
        if (bfhVar.b.j == bln.Rtl) {
            return true;
        }
        return false;
    }

    public static final boolean d(bfh bfhVar) {
        if (!bfhVar.j()) {
            bfe bfeVar = bfhVar.c;
            bfn bfnVar = bfj.a;
            if (!bfeVar.d(bfj.m)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final long e(int i, int i2, int i3, int i4) {
        int min;
        int i5;
        int i6 = 262142;
        int min2 = Math.min(i, 262142);
        int i7 = Integer.MAX_VALUE;
        if (i2 == Integer.MAX_VALUE) {
            min = Integer.MAX_VALUE;
        } else {
            min = Math.min(i2, 262142);
        }
        if (min == Integer.MAX_VALUE) {
            i5 = min2;
        } else {
            i5 = min;
        }
        if (i5 >= 8191) {
            if (i5 < 32767) {
                i6 = 65534;
            } else if (i5 < 65535) {
                i6 = 32766;
            } else if (i5 < 262143) {
                i6 = 8190;
            } else {
                throw new IllegalArgumentException(a.am(i5, "Can't represent a size of ", " in Constraints"));
            }
        }
        if (i4 != Integer.MAX_VALUE) {
            i7 = Math.min(i6, i4);
        }
        return bbc.l(min2, min, Math.min(i6, i3), i7);
    }

    public static final ble f(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        int i = bls.a;
        blr b = bls.b(f);
        if (b == null) {
            b = new blo(f);
        }
        return new blg(f2, f, b);
    }
}
