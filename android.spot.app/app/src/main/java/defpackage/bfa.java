package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfa {
    public static final bfa a = new bfa(new mqd());
    public final mqd b;
    private final float c = 0.0f;
    private final int d = 0;

    public bfa(mqd mqdVar) {
        this.b = mqdVar;
        if (!Float.isNaN(0.0f)) {
        } else {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfa)) {
            return false;
        }
        bfa bfaVar = (bfa) obj;
        float f = bfaVar.c;
        if (!amr.i(this.b, bfaVar.b)) {
            return false;
        }
        int i = bfaVar.d;
        return true;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(0.0f) * 31) + this.b.hashCode()) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=0.0, range=" + this.b + ", steps=0)";
    }
}
