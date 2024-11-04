package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eoy {
    public final boolean a;
    public final eox b;
    public final boolean c;

    public eoy() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eoy) {
            eoy eoyVar = (eoy) obj;
            if (this.a == eoyVar.a && this.b.equals(eoyVar.b) && this.c == eoyVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 1237;
        if (true != this.a) {
            i = 1237;
        } else {
            i = 1231;
        }
        int hashCode = ((i ^ 1000003) * 1000003) ^ this.b.hashCode();
        if (true == this.c) {
            i2 = 1231;
        }
        return (hashCode * 1000003) ^ i2;
    }

    public final String toString() {
        return "EraseDeviceState{buttonEnabled=" + this.a + ", longRunningOperation=" + this.b.toString() + ", forceDeleteRequested=" + this.c + "}";
    }

    public eoy(boolean z, eox eoxVar, boolean z2) {
        this.a = z;
        if (eoxVar == null) {
            throw new NullPointerException("Null longRunningOperation");
        }
        this.b = eoxVar;
        this.c = z2;
    }
}
