package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ilg implements jyj {
    final /* synthetic */ AtomicBoolean a;
    final /* synthetic */ Set b;
    final /* synthetic */ jfd c;
    final /* synthetic */ ilj d;
    final /* synthetic */ Integer e;
    final /* synthetic */ ilk f;

    public ilg(ilk ilkVar, AtomicBoolean atomicBoolean, Set set, jfd jfdVar, ilj iljVar, Integer num) {
        this.a = atomicBoolean;
        this.b = set;
        this.c = jfdVar;
        this.d = iljVar;
        this.e = num;
        this.f = ilkVar;
    }

    @Override // defpackage.jyj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (!this.a.get()) {
            this.b.size();
            ilj iljVar = this.d;
            synchronized (iljVar.c) {
                jjr.m(iljVar.b);
            }
            ilk.a.convert(this.e.intValue(), this.f.g);
            return;
        }
        this.b.size();
        this.c.a(ilk.a);
    }

    @Override // defpackage.jyj
    public final void a(Throwable th) {
    }
}
