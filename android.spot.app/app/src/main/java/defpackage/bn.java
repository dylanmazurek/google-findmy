package defpackage;

import com.google.android.apps.adm.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bn {
    int e;
    int f;
    int g;
    int h;
    int i;
    boolean j;
    String l;
    int m;
    CharSequence n;
    int o;
    CharSequence p;
    ArrayList q;
    ArrayList r;
    ArrayList t;
    public final ArrayList d = new ArrayList();
    boolean k = true;
    boolean s = false;

    public abstract void b();

    public abstract void c();

    public void d(int i, ag agVar, String str, int i2) {
        throw null;
    }

    public abstract void h();

    public abstract void i();

    public void k(ag agVar) {
        throw null;
    }

    public void l(ag agVar, cew cewVar) {
        throw null;
    }

    public void m(ag agVar) {
        throw null;
    }

    public final void n(bm bmVar) {
        this.d.add(bmVar);
        bmVar.d = this.e;
        bmVar.e = this.f;
        bmVar.f = this.g;
        bmVar.g = this.h;
    }

    public final void o(int i, ag agVar) {
        d(i, agVar, null, 1);
    }

    public final void p(int i, ag agVar, String str) {
        d(i, agVar, str, 1);
    }

    public final void q(ag agVar, String str) {
        d(0, agVar, str, 1);
    }

    public final void r(String str) {
        if (this.k) {
            this.j = true;
            this.l = str;
            return;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public final void s() {
        if (!this.j) {
            this.k = false;
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public final void t(int i, ag agVar, String str) {
        d(i, agVar, str, 2);
    }

    public final void u(int i, int i2, int i3, int i4) {
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
    }

    public final void v() {
        this.s = true;
    }

    public final void w(int i, ag agVar) {
        t(i, agVar, null);
    }

    public final void x() {
        u(R.anim.fade_in, R.anim.fade_out, 0, 0);
    }
}
