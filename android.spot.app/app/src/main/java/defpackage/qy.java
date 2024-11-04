package defpackage;

import android.content.DialogInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qy extends cgk {
    private maf A;
    public qu a;
    public DialogInterface.OnClickListener b;
    public DialogInterface.OnClickListener c;
    public CharSequence d;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public cfn l;
    public cfn m;
    public cfn n;
    public cfn o;
    public cfn p;
    public cfn q;
    public cfn s;
    public cfn u;
    public cfn v;
    public jf w;
    public bet x;
    private maf z;
    public int e = 0;
    public boolean r = true;
    public int t = 0;

    public static void l(cfn cfnVar, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            cfnVar.l(obj);
        } else {
            cfnVar.i(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        if (this.x != null) {
            return 32783;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final CharSequence b() {
        CharSequence charSequence = this.d;
        if (charSequence != null) {
            return charSequence;
        }
        if (this.x != null) {
            return "";
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.CharSequence, java.lang.Object] */
    public final CharSequence d() {
        bet betVar = this.x;
        if (betVar != null) {
            return betVar.a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(qj qjVar) {
        if (this.m == null) {
            this.m = new cfn();
        }
        l(this.m, qjVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(boolean z) {
        if (this.o == null) {
            this.o = new cfn();
        }
        l(this.o, Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(boolean z) {
        if (this.s == null) {
            this.s = new cfn();
        }
        l(this.s, Boolean.valueOf(z));
    }

    public final void h(CharSequence charSequence) {
        if (this.v == null) {
            this.v = new cfn();
        }
        l(this.v, charSequence);
    }

    public final void i(int i) {
        if (this.u == null) {
            this.u = new cfn();
        }
        l(this.u, Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(boolean z) {
        if (this.q == null) {
            this.q = new cfn();
        }
        l(this.q, Boolean.valueOf(z));
    }

    public final void k(boolean z) {
        if (this.p == null) {
            this.p = new cfn();
        }
        l(this.p, Boolean.valueOf(z));
    }

    public final jf m() {
        if (this.w == null) {
            this.w = new jf();
        }
        return this.w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final maf n() {
        if (this.z == null) {
            this.z = new maf((byte[]) null);
        }
        return this.z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final maf o() {
        if (this.A == null) {
            this.A = new maf(new qw(this));
        }
        return this.A;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p(kvw kvwVar) {
        if (this.l == null) {
            this.l = new cfn();
        }
        l(this.l, kvwVar);
    }
}
