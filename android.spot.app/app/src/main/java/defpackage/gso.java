package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gso {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public gso(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gso)) {
            return false;
        }
        gso gsoVar = (gso) obj;
        if (this.a == gsoVar.a && this.b == gsoVar.b && this.c == gsoVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((a.i(this.a) * 31) + a.i(this.b)) * 31) + a.i(this.c);
    }

    public final String toString() {
        return "DeliveryAddressCreationConfig(withRegistrationId=" + this.a + ", withFetchOnlyId=" + this.b + ", withAndroidId=" + this.c + ")";
    }

    public gso() {
        this(false, false, false);
    }
}
