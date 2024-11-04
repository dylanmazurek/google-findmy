package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lzf {
    public final lze a;
    public final mca b;

    public lzf(lze lzeVar, mca mcaVar) {
        lzeVar.getClass();
        this.a = lzeVar;
        mcaVar.getClass();
        this.b = mcaVar;
    }

    public static lzf a(lze lzeVar) {
        boolean z;
        if (lzeVar != lze.TRANSIENT_FAILURE) {
            z = true;
        } else {
            z = false;
        }
        hwx.K(z, "state is TRANSIENT_ERROR. Use forError() instead");
        return new lzf(lzeVar, mca.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lzf)) {
            return false;
        }
        lzf lzfVar = (lzf) obj;
        if (!this.a.equals(lzfVar.a) || !this.b.equals(lzfVar.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        mca mcaVar = this.b;
        return mcaVar.hashCode() ^ this.a.hashCode();
    }

    public final String toString() {
        mca mcaVar = this.b;
        if (mcaVar.f()) {
            return this.a.toString();
        }
        return this.a.toString() + "(" + mcaVar.toString() + ")";
    }
}
