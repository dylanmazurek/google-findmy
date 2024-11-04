package defpackage;

import android.os.SystemClock;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dlk implements dkg, dkf {
    public final dkh a;
    public final dkf b;
    public volatile Object c;
    public volatile dke d;
    private volatile int e;
    private volatile dkd f;
    private volatile bso g;

    public dlk(dkh dkhVar, dkf dkfVar) {
        this.a = dkhVar;
        this.b = dkfVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, dje] */
    @Override // defpackage.dkg
    public final void a() {
        bso bsoVar = this.g;
        if (bsoVar != null) {
            bsoVar.c.cr();
        }
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, dje] */
    @Override // defpackage.dkf
    public final void b(dir dirVar, Exception exc, dje djeVar, int i) {
        this.b.b(dirVar, exc, djeVar, this.g.c.g());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, dje] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, dje] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, dje] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, dje] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, dje] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, dje] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, dir] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, dir] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, dje] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, dir] */
    @Override // defpackage.dkg
    public final boolean c() {
        boolean z;
        boolean z2 = false;
        if (this.c != null) {
            Object obj = this.c;
            this.c = null;
            try {
                SystemClock.elapsedRealtimeNanos();
                try {
                    djg a = this.a.c.a().a(obj);
                    Object a2 = a.a();
                    dij c = this.a.c.a().c.c(a2.getClass());
                    if (c != null) {
                        bso bsoVar = new bso(c, a2, this.a.h);
                        ?? r5 = this.g.a;
                        dkh dkhVar = this.a;
                        dke dkeVar = new dke(r5, dkhVar.m);
                        dmc c2 = dkhVar.c();
                        c2.b(dkeVar, bsoVar);
                        if (c2.a(dkeVar) != null) {
                            this.d = dkeVar;
                            this.f = new dkd(Collections.singletonList(this.g.a), this.a, this);
                            this.g.c.d();
                        } else {
                            try {
                                this.b.d(this.g.a, a.a(), this.g.c, this.g.c.g(), this.g.a);
                                return true;
                            } catch (Throwable th) {
                                th = th;
                                z = true;
                                if (!z) {
                                    this.g.c.d();
                                }
                                throw th;
                            }
                        }
                    } else {
                        throw new dgx(a2.getClass());
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z = false;
                }
            } catch (IOException unused) {
            }
        }
        if (this.f != null && this.f.c()) {
            return true;
        }
        this.f = null;
        this.g = null;
        while (!z2 && this.e < this.a.e().size()) {
            List e = this.a.e();
            int i = this.e;
            this.e = i + 1;
            this.g = (bso) e.get(i);
            if (this.g != null && (this.a.o.c(this.g.c.g()) || this.a.g(this.g.c.a()))) {
                this.g.c.f(this.a.n, new dlj(this, this.g));
                z2 = true;
            }
        }
        return z2;
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, dje] */
    @Override // defpackage.dkf
    public final void d(dir dirVar, Object obj, dje djeVar, int i, dir dirVar2) {
        this.b.d(dirVar, obj, djeVar, this.g.c.g(), dirVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e(bso bsoVar) {
        bso bsoVar2 = this.g;
        if (bsoVar2 != null && bsoVar2 == bsoVar) {
            return true;
        }
        return false;
    }
}
