package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class emz {
    public final ewg a;
    public final ele b;
    public final Executor c;
    public final jzd d;
    public jer e;
    public jer f;
    public boolean g;
    public final Object h;
    public final cfo i;
    public final emx j;
    public final igo k;
    public final ici l;
    public final emt m;

    public emz(emx emxVar, ewg ewgVar, ele eleVar, igo igoVar, ici iciVar, emt emtVar, Executor executor, jzd jzdVar) {
        jdl jdlVar = jdl.a;
        this.e = jdlVar;
        this.f = jdlVar;
        this.g = false;
        this.h = new Object();
        this.j = emxVar;
        this.a = ewgVar;
        this.b = eleVar;
        this.k = igoVar;
        this.l = iciVar;
        this.m = emtVar;
        this.c = executor;
        this.d = jzdVar;
        this.i = new egv(this, 13);
        ewgVar.g(new ela(this, 5));
    }

    public final void a() {
        if (!this.j.g()) {
            return;
        }
        this.e = jer.i(jbw.b((jyz) this.e.b(new eil(20)).e(jbx.d(jyv.a))).e(new idg(this, 1), this.d));
        this.f = jer.i(jbx.d(ivc.G(new eli(this, 2), lua.a.a().g(), TimeUnit.SECONDS, this.d)).f(new eji(this, 5), this.d));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, jyz] */
    public final void b() {
        if (this.e.g()) {
            ((jbw) this.e.c()).f().cancel(false);
            this.e = jdl.a;
        }
        if (this.f.g()) {
            this.f.c().cancel(false);
            this.f = jdl.a;
        }
    }
}
