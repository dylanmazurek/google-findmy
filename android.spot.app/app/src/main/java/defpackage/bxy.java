package defpackage;

import android.os.Build;
import android.view.View;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bxy {
    static final bya d;
    final bya e;

    static {
        bxs bxpVar;
        if (Build.VERSION.SDK_INT >= 30) {
            bxpVar = new bxr();
        } else if (Build.VERSION.SDK_INT >= 29) {
            bxpVar = new bxq();
        } else {
            bxpVar = new bxp();
        }
        d = bxpVar.a().i().j().k();
    }

    public bxy(bya byaVar) {
        this.e = byaVar;
    }

    public brq a(int i) {
        return brq.a;
    }

    public brq c() {
        return brq.a;
    }

    public bya d(int i, int i2, int i3, int i4) {
        return d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxy)) {
            return false;
        }
        bxy bxyVar = (bxy) obj;
        if (i() == bxyVar.i() && n() == bxyVar.n() && Objects.equals(c(), bxyVar.c()) && Objects.equals(j(), bxyVar.j()) && Objects.equals(o(), bxyVar.o())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(i()), Boolean.valueOf(n()), c(), j(), o());
    }

    public boolean i() {
        return false;
    }

    public brq j() {
        return brq.a;
    }

    public bya k() {
        return this.e;
    }

    public bya l() {
        return this.e;
    }

    public boolean n() {
        return false;
    }

    public buv o() {
        return null;
    }

    public bya p() {
        return this.e;
    }

    public brq q() {
        return c();
    }

    public brq r() {
        return c();
    }

    public brq s() {
        return c();
    }

    public void e(View view) {
    }

    public void f(brq[] brqVarArr) {
    }

    public void h(bya byaVar) {
    }

    public void m(brq brqVar) {
    }
}
