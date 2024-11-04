package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jwz extends jwy {
    final AtomicReferenceFieldUpdater a;
    final AtomicIntegerFieldUpdater b;

    public jwz(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicIntegerFieldUpdater;
    }

    @Override // defpackage.jwy
    public final int a(jxb jxbVar) {
        return this.b.decrementAndGet(jxbVar);
    }

    @Override // defpackage.jwy
    public final void b(jxb jxbVar, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.a;
            if (atomicReferenceFieldUpdater.compareAndSet(jxbVar, null, set)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(jxbVar) == null);
    }
}
