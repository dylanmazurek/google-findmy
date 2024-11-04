package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bll {
    public static final bll a = new bll(0, 0, 0, 0);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public bll(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bll)) {
            return false;
        }
        bll bllVar = (bll) obj;
        if (this.b == bllVar.b && this.c == bllVar.c && this.d == bllVar.d && this.e == bllVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "IntRect.fromLTRB(" + this.b + ", " + this.c + ", " + this.d + ", " + this.e + ')';
    }
}
