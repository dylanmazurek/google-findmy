package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bev {
    public final mkq a;
    private final String b = null;

    public bev(mkq mkqVar) {
        this.a = mkqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bev)) {
            return false;
        }
        bev bevVar = (bev) obj;
        String str = bevVar.b;
        if (amr.i(null, null) && amr.i(this.a, bevVar.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AccessibilityAction(label=null, action=" + this.a + ')';
    }
}
