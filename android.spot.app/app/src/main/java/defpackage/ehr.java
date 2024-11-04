package defpackage;

import android.app.Activity;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehr implements cem, ewk {
    private final Map a;
    private jer b;
    private jer c;
    private final ewf d;
    private final ebf e;

    public ehr(Activity activity, ebf ebfVar, ewf ewfVar, Map map) {
        jdl jdlVar = jdl.a;
        this.b = jdlVar;
        this.c = jdlVar;
        this.e = ebfVar;
        this.d = ewfVar;
        this.a = map;
        ewfVar.c(this);
        ((cs) activity).f.a(this);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ehq] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, ehq] */
    private final void h() {
        lqc a = this.d.a();
        if (a == null) {
            i();
            return;
        }
        lqd lqdVar = a.d;
        if (lqdVar == null) {
            lqdVar = lqd.d;
        }
        if (!this.b.g() || !this.b.c().j().equals(lqdVar)) {
            i();
            ehs ehsVar = (ehs) this.a.get(eyf.i(a));
            if (ehsVar == null) {
                return;
            }
            lqd lqdVar2 = a.d;
            if (lqdVar2 == null) {
                lqdVar2 = lqd.d;
            }
            this.b = jer.i(ehsVar.a(lqdVar2, this.e));
            this.c = jer.i(a);
            this.b.c().b();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ehq] */
    private final void i() {
        if (!this.b.g()) {
            return;
        }
        this.b.c().c();
        this.b = jdl.a;
        hwx.U(this.c.g());
        this.c = jdl.a;
    }

    @Override // defpackage.cem
    public final void b() {
        h();
    }

    @Override // defpackage.cem
    public final void c() {
        i();
        this.d.g(this);
    }

    @Override // defpackage.ewk
    public final void cx() {
        h();
    }

    public final jer g() {
        if (!this.b.g() && this.d.a() != null) {
            h();
        }
        return this.b;
    }

    @Override // defpackage.cem
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.cem
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.cem
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.cem
    public final /* synthetic */ void cT(cfc cfcVar) {
    }
}
