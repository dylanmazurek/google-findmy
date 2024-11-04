package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bla {
    public static final bla a = new bla(bef.j(0), bef.j(0));
    public final long b;
    public final long c;

    public bla(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bla)) {
            return false;
        }
        bla blaVar = (bla) obj;
        if (a.n(this.b, blaVar.b) && a.n(this.c, blaVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (a.l(this.b) * 31) + a.l(this.c);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) blp.d(this.b)) + ", restLine=" + ((Object) blp.d(this.c)) + ')';
    }
}
