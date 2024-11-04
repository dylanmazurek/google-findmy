package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jwh extends jwc {
    final AtomicReferenceFieldUpdater a;
    final AtomicReferenceFieldUpdater b;
    final AtomicReferenceFieldUpdater c;
    final AtomicReferenceFieldUpdater d;
    final AtomicReferenceFieldUpdater e;

    public jwh(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.jwc
    public final jwg a(jwq jwqVar, jwg jwgVar) {
        return (jwg) this.d.getAndSet(jwqVar, jwgVar);
    }

    @Override // defpackage.jwc
    public final jwp b(jwq jwqVar, jwp jwpVar) {
        return (jwp) this.c.getAndSet(jwqVar, jwpVar);
    }

    @Override // defpackage.jwc
    public final void c(jwp jwpVar, jwp jwpVar2) {
        this.b.lazySet(jwpVar, jwpVar2);
    }

    @Override // defpackage.jwc
    public final void d(jwp jwpVar, Thread thread) {
        this.a.lazySet(jwpVar, thread);
    }

    @Override // defpackage.jwc
    public final boolean e(jwq jwqVar, jwg jwgVar, jwg jwgVar2) {
        return amr.e(this.d, jwqVar, jwgVar, jwgVar2);
    }

    @Override // defpackage.jwc
    public final boolean f(jwq jwqVar, Object obj, Object obj2) {
        return amr.e(this.e, jwqVar, obj, obj2);
    }

    @Override // defpackage.jwc
    public final boolean g(jwq jwqVar, jwp jwpVar, jwp jwpVar2) {
        return amr.e(this.c, jwqVar, jwpVar, jwpVar2);
    }
}
