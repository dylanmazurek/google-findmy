package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqg implements hoc {
    public final String a;
    private final int b;

    public hqg() {
        throw null;
    }

    @Override // defpackage.hoc
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.hoc
    public final boolean b() {
        if (this.b == 1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hqg)) {
            return false;
        }
        hqg hqgVar = (hqg) obj;
        int i = this.b;
        int i2 = hqgVar.b;
        if (i != 0) {
            if (i2 == 1 && this.a.equals(hqgVar.a)) {
                return true;
            }
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        a.N(this.b);
        return this.a.hashCode() ^ (-722379962);
    }

    public final String toString() {
        return "ApplicationExitConfigurations{enablement=" + hod.a(this.b) + ", reportingProcessShortName=" + this.a + "}";
    }

    public hqg(byte[] bArr) {
        this.b = 1;
        this.a = "";
    }
}
