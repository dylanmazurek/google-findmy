package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eso {
    public final boolean a;
    public final boolean b;
    public final kzl c;
    public final int d;

    public eso() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eso) {
            eso esoVar = (eso) obj;
            if (this.a == esoVar.a && this.b == esoVar.b && this.c.equals(esoVar.c) && this.d == esoVar.d) {
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
        if (true == this.b) {
            i2 = 1231;
        }
        return ((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d;
    }

    public final String toString() {
        return "RingingVolumeUiState{visible=" + this.a + ", updatingRingingVolume=" + this.b + ", currentRingingVolume=" + this.c.toString() + ", ringingVolumeLabel=" + this.d + "}";
    }

    public eso(boolean z, boolean z2, kzl kzlVar, int i) {
        this.a = z;
        this.b = z2;
        if (kzlVar == null) {
            throw new NullPointerException("Null currentRingingVolume");
        }
        this.c = kzlVar;
        this.d = i;
    }
}
