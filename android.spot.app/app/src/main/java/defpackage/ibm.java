package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ibm {
    private final int a;
    private final boolean b;

    public ibm() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ibm) {
            ibm ibmVar = (ibm) obj;
            if (this.a == ibmVar.a && this.b == ibmVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return i ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "BatteryState{level=" + this.a + ", isCharging=" + this.b + "}";
    }

    public ibm(int i, boolean z) {
        this.a = i;
        this.b = z;
    }
}
