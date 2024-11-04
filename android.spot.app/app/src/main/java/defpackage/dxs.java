package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dxs extends dxt {
    private final int a;

    public dxs(int i) {
        this.a = i;
    }

    @Override // defpackage.dxy
    public final dxx a() {
        return dxx.DRAWABLE;
    }

    @Override // defpackage.dxt, defpackage.dxy
    public final int c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dxy) {
            dxy dxyVar = (dxy) obj;
            if (dxx.DRAWABLE == dxyVar.a() && this.a == dxyVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "DevicePinSource{drawable=" + this.a + "}";
    }
}
