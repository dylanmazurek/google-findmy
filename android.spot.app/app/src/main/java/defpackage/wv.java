package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wv implements wq {
    private final ws a;
    private final long b;

    public wv(ws wsVar) {
        this.a = wsVar;
        wz wzVar = (wz) wsVar;
        this.b = (wzVar.b + wzVar.a) * 1000000;
    }

    private final long f(long j) {
        if (j <= 0) {
            return 0L;
        }
        long j2 = this.b;
        return j - ((j / j2) * j2);
    }

    private final va g(long j, va vaVar, va vaVar2, va vaVar3) {
        long j2 = this.b;
        if (j > j2) {
            return this.a.d(j2, vaVar, vaVar3, vaVar2);
        }
        return vaVar2;
    }

    @Override // defpackage.wq
    public final long a(va vaVar, va vaVar2, va vaVar3) {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.wq
    public final /* synthetic */ va b(va vaVar, va vaVar2, va vaVar3) {
        return rc.c(this, vaVar, vaVar2, vaVar3);
    }

    @Override // defpackage.wq
    public final va c(long j, va vaVar, va vaVar2, va vaVar3) {
        return this.a.c(f(j), vaVar, vaVar2, g(j, vaVar, vaVar3, vaVar2));
    }

    @Override // defpackage.wq
    public final va d(long j, va vaVar, va vaVar2, va vaVar3) {
        return this.a.d(f(j), vaVar, vaVar2, g(j, vaVar, vaVar3, vaVar2));
    }

    @Override // defpackage.wq
    public final boolean e() {
        return true;
    }
}
