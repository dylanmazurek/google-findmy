package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yg {
    private final float a = 0.0f;
    private final boolean b = true;
    private final rm d = null;
    private final yd c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg)) {
            return false;
        }
        yg ygVar = (yg) obj;
        float f = ygVar.a;
        if (Float.compare(0.0f, 0.0f) != 0) {
            return false;
        }
        boolean z = ygVar.b;
        rm rmVar = ygVar.d;
        if (!amr.i(null, null)) {
            return false;
        }
        yd ydVar = ygVar.c;
        if (amr.i(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(0.0f) * 31) + a.i(true)) * 961;
    }

    public final String toString() {
        return "RowColumnParentData(weight=0.0, fill=true, crossAxisAlignment=null, flowLayoutData=null)";
    }
}
