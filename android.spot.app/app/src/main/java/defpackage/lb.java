package defpackage;

import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lb {
    public static void a(PopupWindow popupWindow, boolean z) {
        popupWindow.setTouchModal(z);
    }

    public static final float b(bau bauVar) {
        return ((rp) bauVar.a).b;
    }

    public static final float c(bau bauVar) {
        return ((rp) bauVar.a).a;
    }

    public static final void d(bau bauVar) {
        if (!bauVar.d()) {
            bauVar.b(0, 0, 0, 0);
            return;
        }
        float b = b(bauVar);
        float c = c(bauVar);
        int ceil = (int) Math.ceil(rq.a(b, c, bauVar.c()));
        int ceil2 = (int) Math.ceil(rq.b(b, c, bauVar.c()));
        bauVar.b(ceil, ceil2, ceil, ceil2);
    }

    public static final long e(aum aumVar, boolean z) {
        long d = aqk.d(aumVar.c, aumVar.g);
        if (!z && aumVar.c()) {
            return 0L;
        }
        return d;
    }

    public static final boolean f(aum aumVar) {
        if (!aumVar.h && aumVar.d) {
            return true;
        }
        return false;
    }

    public static final boolean g(aum aumVar) {
        if (!aumVar.c() && aumVar.h && !aumVar.d) {
            return true;
        }
        return false;
    }

    public static final boolean h(aum aumVar) {
        if (aumVar.h && !aumVar.d) {
            return true;
        }
        return false;
    }

    @mkp
    public static final boolean i(aum aumVar, long j) {
        long j2 = aumVar.c;
        float b = aqk.b(j2);
        float c = aqk.c(j2);
        if (b >= 0.0f && b <= blm.b(j) && c >= 0.0f && c <= blm.a(j)) {
            return false;
        }
        return true;
    }

    public static final boolean j(aum aumVar) {
        if (!a.n(e(aumVar, true), 0L)) {
            return true;
        }
        return false;
    }

    public static final long k(int i) {
        return i << 32;
    }
}
