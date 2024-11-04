package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class vv implements uu {
    private final uu a;
    private final long b;

    public vv(uu uuVar, long j) {
        this.a = uuVar;
        this.b = j;
    }

    @Override // defpackage.uu
    public final wq a(atk atkVar) {
        return new vw(this.a.a(atkVar), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vv)) {
            return false;
        }
        vv vvVar = (vv) obj;
        if (vvVar.b != this.b || !amr.i(vvVar.a, this.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.l(this.b);
    }
}
