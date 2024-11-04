package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hae {
    public final String a;
    public final int b;
    public final miv c;
    public final frx d;

    public hae() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hae) {
            hae haeVar = (hae) obj;
            frx frxVar = this.d;
            if (frxVar != null ? frxVar.equals(haeVar.d) : haeVar.d == null) {
                miv mivVar = this.c;
                if (mivVar != null ? mivVar.equals(haeVar.c) : haeVar.c == null) {
                    String str = this.a;
                    if (str != null ? str.equals(haeVar.a) : haeVar.a == null) {
                        int i = this.b;
                        int i2 = haeVar.b;
                        if (i != 0 ? i == i2 : i2 == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        frx frxVar = this.d;
        int i = 0;
        if (frxVar == null) {
            hashCode = 0;
        } else {
            hashCode = frxVar.hashCode();
        }
        miv mivVar = this.c;
        if (mivVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = mivVar.hashCode();
        }
        int i2 = hashCode ^ 1000003;
        String str = this.a;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i3 = ((((i2 * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003;
        int i4 = this.b;
        if (i4 != 0) {
            a.V(i4);
            i = i4;
        }
        return i3 ^ i;
    }

    public final String toString() {
        String str;
        miv mivVar = this.c;
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(mivVar);
        int i = this.b;
        if (i != 0) {
            str = Integer.toString(a.s(i));
        } else {
            str = "null";
        }
        return "RingContent{scalableRingDrawableProvider=" + valueOf + ", ringDrawableProvider=" + valueOf2 + ", contentDescription=" + this.a + ", discAnimationType=" + str + "}";
    }

    public hae(frx frxVar, miv mivVar, String str, int i) {
        this.d = frxVar;
        this.c = mivVar;
        this.a = str;
        this.b = i;
    }
}
