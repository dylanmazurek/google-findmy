package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehj {
    public final jer a;
    public final boolean b;
    public final boolean c;

    public ehj() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ehj) {
            ehj ehjVar = (ehj) obj;
            if (this.a.equals(ehjVar.a) && this.b == ehjVar.b && this.c == ehjVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() ^ 1000003;
        int i2 = 1237;
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i3 = ((hashCode * 1000003) ^ i) * 1000003;
        if (true == this.c) {
            i2 = 1231;
        }
        return i3 ^ i2;
    }

    public final String toString() {
        return "SecureDeviceUiState{loadingState=" + this.a.toString() + ", secureDeviceRequestSent=" + this.b + ", markAsFoundRequestSent=" + this.c + "}";
    }

    public ehj(jer jerVar, boolean z, boolean z2) {
        this.a = jerVar;
        this.b = z;
        this.c = z2;
    }
}
