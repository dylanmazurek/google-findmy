package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdz {
    public final boolean a;

    public hdz() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof hdz) && this.a == ((hdz) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        if (true != this.a) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((i ^ 1000003) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "Configuration{showSwitchProfileAction=" + this.a + ", disableDecorationFeatures=false}";
    }

    public hdz(byte[] bArr) {
        this.a = true;
    }
}
