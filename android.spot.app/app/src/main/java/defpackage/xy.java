package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xy {
    public final ble a;
    public final long b;

    public xy(ble bleVar, long j) {
        this.a = bleVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xy)) {
            return false;
        }
        xy xyVar = (xy) obj;
        if (amr.i(this.a, xyVar.a) && a.n(this.b, xyVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.l(this.b);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.a + ", constraints=" + ((Object) bld.e(this.b)) + ')';
    }
}
