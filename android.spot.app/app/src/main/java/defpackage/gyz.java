package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyz {
    public final boolean a;
    private final int b;

    public gyz() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gyz) {
            gyz gyzVar = (gyz) obj;
            if (this.a == gyzVar.a) {
                int i = this.b;
                int i2 = gyzVar.b;
                if (i != 0) {
                    if (i == i2) {
                        return true;
                    }
                } else {
                    throw null;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = this.b;
        a.V(i2);
        if (true != this.a) {
            i = 1237;
        } else {
            i = 1231;
        }
        return i2 ^ ((i ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "GaiaAccountData{isG1User=" + this.a + ", isUnicornUser=" + frx.aA(this.b) + "}";
    }

    public gyz(boolean z, int i) {
        this.a = z;
        this.b = i;
    }
}
