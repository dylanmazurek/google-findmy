package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjs {
    public final bfs a;
    public final long b;
    private final bgl c;

    public /* synthetic */ bjs(bfs bfsVar, long j) {
        this.a = bfsVar;
        int length = bfsVar.a.length();
        int ae = moz.ae(bgl.b(j), 0, length);
        int ae2 = moz.ae(bgl.a(j), 0, length);
        this.b = (ae == bgl.b(j) && ae2 == bgl.a(j)) ? j : rh.d(ae, ae2);
        this.c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bjs)) {
            return false;
        }
        bjs bjsVar = (bjs) obj;
        if (a.n(this.b, bjsVar.b)) {
            bgl bglVar = bjsVar.c;
            if (amr.i(null, null) && amr.i(this.a, bjsVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() * 31) + a.l(this.b)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextFieldValue(text='");
        sb.append((Object) this.a);
        sb.append("', selection=");
        StringBuilder sb2 = new StringBuilder("TextRange(");
        long j = this.b;
        sb2.append(bgl.b(j));
        sb2.append(", ");
        sb2.append(bgl.a(j));
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(", composition=null)");
        return sb.toString();
    }
}
