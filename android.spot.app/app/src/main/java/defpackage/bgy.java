package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgy {
    public final int a;
    public final int b;
    public final boolean c;

    public bgy(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgy)) {
            return false;
        }
        bgy bgyVar = (bgy) obj;
        if (this.a == bgyVar.a && this.b == bgyVar.b && this.c == bgyVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + a.i(this.c);
    }

    public final String toString() {
        return "BidiRun(start=" + this.a + ", end=" + this.b + ", isRtl=" + this.c + ')';
    }
}
