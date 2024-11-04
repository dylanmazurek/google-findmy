package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class x extends pf {
    final /* synthetic */ AtomicReference a;

    public x(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // defpackage.pf
    public final void a() {
        throw null;
    }

    @Override // defpackage.pf
    public final void b(Object obj) {
        pf pfVar = (pf) this.a.get();
        if (pfVar != null) {
            pfVar.b(obj);
            return;
        }
        throw new IllegalStateException("Operation cannot be started before fragment is in created state");
    }
}
