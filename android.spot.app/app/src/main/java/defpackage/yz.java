package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yz {
    public bfs a;
    public boolean b = false;
    public ys c = null;
    private final bfs d;

    public yz(bfs bfsVar, bfs bfsVar2) {
        this.d = bfsVar;
        this.a = bfsVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz)) {
            return false;
        }
        yz yzVar = (yz) obj;
        if (amr.i(this.d, yzVar.d) && amr.i(this.a, yzVar.a) && this.b == yzVar.b && amr.i(this.c, yzVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.d.hashCode() * 31) + this.a.hashCode();
        int i = a.i(this.b);
        ys ysVar = this.c;
        if (ysVar == null) {
            hashCode = 0;
        } else {
            hashCode = ysVar.hashCode();
        }
        return (((hashCode2 * 31) + i) * 31) + hashCode;
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.d) + ", substitution=" + ((Object) this.a) + ", isShowingSubstitution=" + this.b + ", layoutCache=" + this.c + ')';
    }
}
