package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blb {
    public static final blb a = new blb(2, false);
    private static final blb d = new blb(1, true);
    public final int b;
    public final boolean c;

    private blb(int i, boolean z) {
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blb)) {
            return false;
        }
        blb blbVar = (blb) obj;
        if (a.m(this.b, blbVar.b) && this.c == blbVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.b * 31) + a.i(this.c);
    }

    public final String toString() {
        if (amr.i(this, a)) {
            return "TextMotion.Static";
        }
        if (amr.i(this, d)) {
            return "TextMotion.Animated";
        }
        return "Invalid";
    }
}
