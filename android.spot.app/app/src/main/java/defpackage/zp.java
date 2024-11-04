package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zp {
    public final long a;
    private final long b;

    public zp(long j, long j2) {
        this.b = j;
        this.a = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zp)) {
            return false;
        }
        zp zpVar = (zp) obj;
        if (a.n(this.b, zpVar.b) && a.n(this.a, zpVar.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (a.l(this.b) * 31) + a.l(this.a);
    }

    public final String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) aqx.g(this.b)) + ", selectionBackgroundColor=" + ((Object) aqx.g(this.a)) + ')';
    }
}
