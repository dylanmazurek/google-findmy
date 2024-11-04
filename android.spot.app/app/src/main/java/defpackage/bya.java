package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bya {
    public static final bya a;
    public final bxy b;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            a = bxx.c;
        } else {
            a = bxy.d;
        }
    }

    private bya(WindowInsets windowInsets) {
        this.b = Build.VERSION.SDK_INT >= 30 ? new bxx(this, windowInsets) : Build.VERSION.SDK_INT >= 29 ? new bxw(this, windowInsets) : Build.VERSION.SDK_INT >= 28 ? new bxv(this, windowInsets) : new bxu(this, windowInsets);
    }

    public static brq h(brq brqVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, brqVar.b - i);
        int max2 = Math.max(0, brqVar.c - i2);
        int max3 = Math.max(0, brqVar.d - i3);
        int max4 = Math.max(0, brqVar.e - i4);
        if (max == i && max2 == i2 && max3 == i3 && max4 == i4) {
            return brqVar;
        }
        return brq.d(max, max2, max3, max4);
    }

    public static bya m(WindowInsets windowInsets) {
        return n(windowInsets, null);
    }

    public static bya n(WindowInsets windowInsets, View view) {
        bqd.n(windowInsets);
        bya byaVar = new bya(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            byaVar.q(bwn.e(view));
            byaVar.o(view.getRootView());
        }
        return byaVar;
    }

    @Deprecated
    public final int a() {
        return this.b.c().e;
    }

    @Deprecated
    public final int b() {
        return this.b.c().b;
    }

    @Deprecated
    public final int c() {
        return this.b.c().d;
    }

    @Deprecated
    public final int d() {
        return this.b.c().c;
    }

    public final WindowInsets e() {
        bxy bxyVar = this.b;
        if (bxyVar instanceof bxt) {
            return ((bxt) bxyVar).a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bya)) {
            return false;
        }
        return Objects.equals(this.b, ((bya) obj).b);
    }

    public final brq f(int i) {
        return this.b.a(i);
    }

    @Deprecated
    public final brq g() {
        return this.b.j();
    }

    public final int hashCode() {
        bxy bxyVar = this.b;
        if (bxyVar == null) {
            return 0;
        }
        return bxyVar.hashCode();
    }

    @Deprecated
    public final bya i() {
        return this.b.p();
    }

    @Deprecated
    public final bya j() {
        return this.b.k();
    }

    @Deprecated
    public final bya k() {
        return this.b.l();
    }

    public final bya l(int i, int i2, int i3, int i4) {
        return this.b.d(i, i2, i3, i4);
    }

    public final void o(View view) {
        this.b.e(view);
    }

    public final void p(brq[] brqVarArr) {
        this.b.f(brqVarArr);
    }

    public final void q(bya byaVar) {
        this.b.h(byaVar);
    }

    public final boolean r() {
        return this.b.n();
    }

    public bya() {
        this.b = new bxy(this);
    }
}
