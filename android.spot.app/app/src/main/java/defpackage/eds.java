package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eds {
    public final lqc a;
    public final eeb b;
    public final boolean c;

    public eds(lqc lqcVar, eeb eebVar, boolean z) {
        this.a = lqcVar;
        this.b = eebVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eds)) {
            return false;
        }
        eds edsVar = (eds) obj;
        if (amr.i(this.a, edsVar.a) && amr.i(this.b, edsVar.b) && this.c == edsVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode;
        lqc lqcVar = this.a;
        if (lqcVar.y()) {
            i = lqcVar.i();
        } else {
            int i2 = lqcVar.y;
            if (i2 == 0) {
                i2 = lqcVar.i();
                lqcVar.y = i2;
            }
            i = i2;
        }
        eeb eebVar = this.b;
        if (eebVar == null) {
            hashCode = 0;
        } else {
            hashCode = eebVar.hashCode();
        }
        return (((i * 31) + hashCode) * 31) + a.i(this.c);
    }

    public final String toString() {
        return "AccessoryDeviceUiState(device=" + this.a + ", location=" + this.b + ", isLocateInProgress=" + this.c + ")";
    }
}
