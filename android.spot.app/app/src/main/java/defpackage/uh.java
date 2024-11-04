package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uh {
    public final vj a;
    private final float b = 0.0f;

    public uh(vj vjVar) {
        this.a = vjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uh)) {
            return false;
        }
        uh uhVar = (uh) obj;
        float f = uhVar.b;
        if (Float.compare(0.0f, 0.0f) == 0 && amr.i(this.a, uhVar.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(0.0f) * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.a + ')';
    }
}
