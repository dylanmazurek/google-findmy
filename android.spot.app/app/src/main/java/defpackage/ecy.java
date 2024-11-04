package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ecy {
    public final int a;
    public final int b;
    public final String c;
    public final boolean d;
    public final jer e;

    public ecy() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ecy) {
            ecy ecyVar = (ecy) obj;
            if (this.a == ecyVar.a && this.b == ecyVar.b && this.c.equals(ecyVar.c) && this.d == ecyVar.d && this.e.equals(ecyVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
        if (true != this.d) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (((hashCode * 1000003) ^ i) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "RingUiUpdate{ringButtonText=" + this.a + ", ringButtonIconDrawable=" + this.b + ", explanationMessage=" + this.c + ", ringButtonEnabled=" + this.d + ", minutesToRingDeviceForAccessibility=" + String.valueOf(this.e) + "}";
    }

    public ecy(int i, int i2, String str, boolean z, jer jerVar) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = z;
        this.e = jerVar;
    }
}
