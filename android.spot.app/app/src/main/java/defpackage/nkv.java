package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nkv extends nln {
    public nln a;

    public nkv(nln nlnVar) {
        nlnVar.getClass();
        this.a = nlnVar;
    }

    @Override // defpackage.nln
    public final boolean g() {
        return this.a.g();
    }

    @Override // defpackage.nln
    public final long h() {
        return this.a.h();
    }

    @Override // defpackage.nln
    public final nln i() {
        return this.a.i();
    }

    @Override // defpackage.nln
    public final nln j(long j) {
        return this.a.j(j);
    }

    @Override // defpackage.nln
    public final nln k(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.a.k(10000L, timeUnit);
    }

    @Override // defpackage.nln
    public final void l() {
        this.a.l();
    }

    @Override // defpackage.nln
    public final nln m() {
        return this.a.m();
    }
}
