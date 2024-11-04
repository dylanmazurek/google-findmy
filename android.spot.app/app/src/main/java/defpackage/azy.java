package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class azy implements azv {
    public final awi a;
    public final azc b;

    public azy(awi awiVar, azc azcVar) {
        this.a = awiVar;
        this.b = azcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azy)) {
            return false;
        }
        azy azyVar = (azy) obj;
        if (amr.i(this.a, azyVar.a) && amr.i(this.b, azyVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "PlaceableResult(result=" + this.a + ", placeable=" + this.b + ')';
    }

    @Override // defpackage.azv
    public final boolean y() {
        return this.b.F().j();
    }
}
