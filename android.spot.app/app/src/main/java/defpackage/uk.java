package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uk {
    public final float a;
    public final long b;
    public final vj c;

    public uk(float f, long j, vj vjVar) {
        this.a = f;
        this.b = j;
        this.c = vjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uk)) {
            return false;
        }
        uk ukVar = (uk) obj;
        if (Float.compare(this.a, ukVar.a) == 0 && a.n(this.b, ukVar.b) && amr.i(this.c, ukVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + a.l(this.b)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Scale(scale=" + this.a + ", transformOrigin=" + ((Object) aro.c(this.b)) + ", animationSpec=" + this.c + ')';
    }
}
