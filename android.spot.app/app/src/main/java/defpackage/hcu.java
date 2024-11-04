package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hcu {
    private final cfn a;
    final cfn b;
    final cfn c;
    final cfn d;
    public final cfn e;
    final int f;
    public hgw g;
    public jer h;
    final cfn i;
    private View.OnClickListener j;

    hcu() {
        this(105607);
    }

    public void b(cfc cfcVar, cfo cfoVar) {
        this.a.g(cfcVar, cfoVar);
    }

    public void c(cfc cfcVar) {
        this.a.k(cfcVar);
    }

    public final void g() {
        hha hhaVar = new hha(this.j);
        hhaVar.c = new gcb(this, 19);
        hhaVar.d = new gcb(this, 20);
        hog.R(this.b, jer.i(new hgz(hhaVar)));
    }

    public final void m(View.OnClickListener onClickListener) {
        this.j = onClickListener;
        g();
    }

    public final void n(boolean z) {
        hog.R(this.a, Boolean.valueOf(z));
    }

    public hcu(int i) {
        this.a = new cfn(true);
        this.b = new cfn(jdl.a);
        this.c = new cfn(jdl.a);
        this.d = new cfn(false);
        this.e = new cfn(jdl.a);
        this.j = new hhi(1);
        this.g = new hht(1);
        this.h = jdl.a;
        this.f = i;
    }

    public hcu(hdp hdpVar, int i) {
        this(i);
        this.i = new cfn(hdpVar);
    }

    public void d() {
    }

    public void a(cfc cfcVar) {
    }
}
