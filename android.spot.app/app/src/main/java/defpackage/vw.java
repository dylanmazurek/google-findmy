package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class vw implements wq {
    private final wq a;
    private final long b;

    public vw(wq wqVar, long j) {
        this.a = wqVar;
        this.b = j;
    }

    @Override // defpackage.wq
    public final long a(va vaVar, va vaVar2, va vaVar3) {
        return this.a.a(vaVar, vaVar2, vaVar3) + this.b;
    }

    @Override // defpackage.wq
    public final /* synthetic */ va b(va vaVar, va vaVar2, va vaVar3) {
        return rc.c(this, vaVar, vaVar2, vaVar3);
    }

    @Override // defpackage.wq
    public final va c(long j, va vaVar, va vaVar2, va vaVar3) {
        long j2 = this.b;
        if (j < j2) {
            return vaVar;
        }
        return this.a.c(j - j2, vaVar, vaVar2, vaVar3);
    }

    @Override // defpackage.wq
    public final va d(long j, va vaVar, va vaVar2, va vaVar3) {
        long j2 = this.b;
        if (j < j2) {
            return vaVar3;
        }
        return this.a.d(j - j2, vaVar, vaVar2, vaVar3);
    }

    @Override // defpackage.wq
    public final boolean e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vw)) {
            return false;
        }
        vw vwVar = (vw) obj;
        if (vwVar.b != this.b || !amr.i(vwVar.a, this.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.l(this.b);
    }
}
