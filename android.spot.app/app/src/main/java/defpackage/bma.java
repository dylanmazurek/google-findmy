package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bma extends blv {
    final AtomicReferenceFieldUpdater a;
    final AtomicReferenceFieldUpdater b;
    final AtomicReferenceFieldUpdater c;
    final AtomicReferenceFieldUpdater d;
    final AtomicReferenceFieldUpdater e;

    public bma(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.blv
    public final void a(bmd bmdVar, bmd bmdVar2) {
        this.b.lazySet(bmdVar, bmdVar2);
    }

    @Override // defpackage.blv
    public final void b(bmd bmdVar, Thread thread) {
        this.a.lazySet(bmdVar, thread);
    }

    @Override // defpackage.blv
    public final boolean c(bme bmeVar, blz blzVar, blz blzVar2) {
        return amr.e(this.d, bmeVar, blzVar, blzVar2);
    }

    @Override // defpackage.blv
    public final boolean d(bme bmeVar, Object obj, Object obj2) {
        return amr.e(this.e, bmeVar, obj, obj2);
    }

    @Override // defpackage.blv
    public final boolean e(bme bmeVar, bmd bmdVar, bmd bmdVar2) {
        return amr.e(this.c, bmeVar, bmdVar, bmdVar2);
    }
}
