package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehx {
    public final lqc a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final jer e;
    public final jer f;

    public ehx() {
        throw null;
    }

    public static gip b() {
        gip gipVar = new gip(null, null);
        gipVar.k(false);
        return gipVar;
    }

    public final String a() {
        return this.a.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ehx) {
            ehx ehxVar = (ehx) obj;
            if (this.a.equals(ehxVar.a) && this.b == ehxVar.b && this.c == ehxVar.c && this.d.equals(ehxVar.d) && this.e.equals(ehxVar.e) && this.f.equals(ehxVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        lqc lqcVar = this.a;
        if (lqcVar.y()) {
            i = lqcVar.i();
        } else {
            int i3 = lqcVar.y;
            if (i3 == 0) {
                i3 = lqcVar.i();
                lqcVar.y = i3;
            }
            i = i3;
        }
        int i4 = 1237;
        if (true != this.b) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int i5 = i ^ 1000003;
        if (true == this.c) {
            i4 = 1231;
        }
        return (((((((((i5 * 1000003) ^ i2) * 1000003) ^ i4) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        jer jerVar = this.f;
        jer jerVar2 = this.e;
        return "DeviceDetails{device=" + String.valueOf(this.a) + ", editNameSupported=" + this.b + ", renamingInProgress=" + this.c + ", model=" + this.d + ", imei=" + String.valueOf(jerVar2) + ", registrationTimestampSec=" + String.valueOf(jerVar) + "}";
    }

    public ehx(lqc lqcVar, boolean z, boolean z2, String str, jer jerVar, jer jerVar2) {
        this.a = lqcVar;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = jerVar;
        this.f = jerVar2;
    }
}
