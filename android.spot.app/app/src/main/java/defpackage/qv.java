package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qv implements cem {
    private final WeakReference a;

    public qv(qy qyVar) {
        this.a = new WeakReference(qyVar);
    }

    @Override // defpackage.cem
    public final void c() {
        if (this.a.get() != null) {
            ((qy) this.a.get()).w = null;
        }
    }

    @Override // defpackage.cem
    public final /* synthetic */ void b() {
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
