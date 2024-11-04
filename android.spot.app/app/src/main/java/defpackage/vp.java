package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vp extends vo {
    public final int c;

    public vp(Object obj, vg vgVar) {
        super(obj, vgVar);
        this.c = 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vp)) {
            return false;
        }
        vp vpVar = (vp) obj;
        if (amr.i(vpVar.a, this.a) && amr.i(vpVar.b, this.b)) {
            int i = vpVar.c;
            if (a.m(0, 0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 961) + this.b.hashCode();
    }
}
