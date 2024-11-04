package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgg {
    public final bgf a;
    public final bge b;

    public bgg(bge bgeVar) {
        this.a = null;
        this.b = bgeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgg)) {
            return false;
        }
        bgg bggVar = (bgg) obj;
        if (!amr.i(this.b, bggVar.b)) {
            return false;
        }
        bgf bgfVar = bggVar.a;
        if (amr.i(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 38347;
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=null, paragraphSyle=" + this.b + ')';
    }

    public bgg() {
        this(new bge(null));
    }
}
