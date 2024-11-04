package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eux {
    public final jis a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public eux() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eux) {
            eux euxVar = (eux) obj;
            if (hzc.L(this.a, euxVar.a) && this.b == euxVar.b && this.c == euxVar.c && this.d == euxVar.d && this.e == euxVar.e && this.f == euxVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f;
    }

    public final String toString() {
        return "MarkerDrawable{iconDrawables=" + String.valueOf(this.a) + ", strokeWidth=" + this.b + ", pinLegHeight=" + this.c + ", padding=" + this.d + ", borderColor=" + this.e + ", backgroundColor=" + this.f + "}";
    }

    public eux(jis jisVar, int i, int i2, int i3, int i4, int i5) {
        this.a = jisVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
    }
}
