package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffh {
    public final int a;
    public final loa b;

    public ffh() {
        throw null;
    }

    public static ffh a(int i, loa loaVar) {
        fma.aF(true);
        fma.aR(loaVar);
        return new ffh(i, loaVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ffh) {
            ffh ffhVar = (ffh) obj;
            if (this.a == ffhVar.a && this.b.equals(ffhVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "ComplianceProductData{productId=" + this.a + ", productIdOrigin=" + this.b.toString() + "}";
    }

    public ffh(int i, loa loaVar) {
        this.a = i;
        this.b = loaVar;
    }
}
