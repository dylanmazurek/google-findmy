package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vn implements uu {
    private final vf a;
    private final int c = 1;
    private final long b = 0;

    public vn(vf vfVar) {
        this.a = vfVar;
    }

    @Override // defpackage.uu
    public final wq a(atk atkVar) {
        return new wv(((wn) this.a).b());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vn) {
            vn vnVar = (vn) obj;
            if (amr.i(vnVar.a, this.a)) {
                int i = vnVar.c;
                long j = vnVar.b;
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        a.N(1);
        return (hashCode + 1) * 31;
    }
}
