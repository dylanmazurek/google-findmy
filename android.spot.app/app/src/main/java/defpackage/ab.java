package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ab extends ae {
    final /* synthetic */ qe a;
    final /* synthetic */ AtomicReference b;
    final /* synthetic */ pn c;
    final /* synthetic */ pd d;
    final /* synthetic */ ag e;

    public ab(ag agVar, qe qeVar, AtomicReference atomicReference, pn pnVar, pd pdVar) {
        this.e = agVar;
        this.a = qeVar;
        this.b = atomicReference;
        this.c = pnVar;
        this.d = pdVar;
    }

    @Override // defpackage.ae
    public final void a() {
        StringBuilder sb = new StringBuilder("fragment_");
        ag agVar = this.e;
        sb.append(agVar.l);
        sb.append("_rq#");
        sb.append(agVar.ab.getAndIncrement());
        this.b.set(((pk) this.a.a()).b(sb.toString(), this.e, this.c, this.d));
    }
}
