package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mjj extends mji {
    private final AtomicIntegerFieldUpdater a;

    public mjj(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.a = atomicIntegerFieldUpdater;
    }

    @Override // defpackage.mji
    public final boolean a(mjl mjlVar) {
        return this.a.compareAndSet(mjlVar, 0, -1);
    }

    @Override // defpackage.mji
    public final void b(mjl mjlVar) {
        this.a.set(mjlVar, 0);
    }
}
