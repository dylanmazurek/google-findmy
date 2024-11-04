package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eof {
    public final lpz a;
    public final boolean b;
    public final boolean c;

    public eof() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eof) {
            eof eofVar = (eof) obj;
            if (this.a.equals(eofVar.a) && this.b == eofVar.b && this.c == eofVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        lpz lpzVar = this.a;
        if (lpzVar.y()) {
            i = lpzVar.i();
        } else {
            int i3 = lpzVar.y;
            if (i3 == 0) {
                i3 = lpzVar.i();
                lpzVar.y = i3;
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
        return (((i5 * 1000003) ^ i2) * 1000003) ^ i4;
    }

    public final String toString() {
        return "SpotDeviceDetails{spotInfo=" + String.valueOf(this.a) + ", isPrimaryOwner=" + this.b + ", updatingCategory=" + this.c + "}";
    }

    public eof(lpz lpzVar, boolean z, boolean z2) {
        this.a = lpzVar;
        this.b = z;
        this.c = z2;
    }
}
