package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amq extends ams {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public amq(int r4, defpackage.anf r5) {
        /*
            r3 = this;
            java.lang.Object r0 = defpackage.anm.c
            monitor-enter(r0)
            java.util.List r1 = defpackage.anm.h     // Catch: java.lang.Throwable -> L18
            java.lang.Object r2 = defpackage.mkm.ab(r1)     // Catch: java.lang.Throwable -> L18
            moh r2 = (defpackage.moh) r2     // Catch: java.lang.Throwable -> L18
            if (r2 != 0) goto L12
            amn r2 = new amn     // Catch: java.lang.Throwable -> L18
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L18
        L12:
            monitor-exit(r0)
            r0 = 0
            r3.<init>(r4, r5, r0, r2)
            return
        L18:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amq.<init>(int, anf):void");
    }

    @Override // defpackage.ams
    public final ams a(moh mohVar, moh mohVar2) {
        return (ams) anm.c(new amo(mohVar, mohVar2));
    }

    @Override // defpackage.ams, defpackage.amz
    public final amz b(moh mohVar) {
        return anm.c(new amp(mohVar));
    }

    @Override // defpackage.ams
    public final anc c() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override // defpackage.ams, defpackage.amz
    public final void d() {
        synchronized (anm.c) {
            z();
        }
    }

    @Override // defpackage.ams, defpackage.amz
    public final void e() {
        anm.r();
    }

    @Override // defpackage.ams, defpackage.amz
    public final /* synthetic */ void f() {
        amr.o();
    }

    @Override // defpackage.ams, defpackage.amz
    public final /* synthetic */ void g() {
        amr.o();
    }
}
