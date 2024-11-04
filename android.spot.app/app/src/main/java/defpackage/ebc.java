package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebc {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public ebc() {
        throw null;
    }

    public static ebb a() {
        ebb ebbVar = new ebb();
        ebbVar.c(true);
        ebbVar.b(false);
        return ebbVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebc) {
            ebc ebcVar = (ebc) obj;
            String str = this.a;
            if (str != null ? str.equals(ebcVar.a) : ebcVar.a == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(ebcVar.b) : ebcVar.b == null) {
                    if (this.c == ebcVar.c && this.d == ebcVar.d) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        String str = this.a;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        String str2 = this.b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int i3 = hashCode ^ 1000003;
        int i4 = 1237;
        if (true != this.c) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i5 = ((((i3 * 1000003) ^ i2) * 1000003) ^ i) * 1000003;
        if (true == this.d) {
            i4 = 1231;
        }
        return i5 ^ i4;
    }

    public final String toString() {
        return "FragmentTransactionOptions{tag=" + this.a + ", backStackStateName=" + this.b + ", executePendingTransactions=" + this.c + ", applyCustomAnimations=" + this.d + "}";
    }

    public ebc(String str, String str2, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }
}
