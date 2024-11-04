package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzf implements dzp {
    public final dzs a;
    public final boolean b;
    public boolean c;
    public boolean d;
    private final boolean e;

    public /* synthetic */ dzf(dzs dzsVar, boolean z) {
        dzsVar.getClass();
        this.a = dzsVar;
        this.b = z;
        this.c = false;
        this.d = false;
        this.e = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dzf)) {
            return false;
        }
        dzf dzfVar = (dzf) obj;
        if (!amr.i(this.a, dzfVar.a) || this.b != dzfVar.b || this.c != dzfVar.c || this.d != dzfVar.d) {
            return false;
        }
        boolean z = dzfVar.e;
        return true;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = a.i(this.c);
        return ((((((hashCode + a.i(this.b)) * 31) + i) * 31) + a.i(this.d)) * 31) + a.i(false);
    }

    public final String toString() {
        return "DeviceItem(deviceItemState=" + this.a + ", clickable=" + this.b + ", isTop=" + this.c + ", isBottom=" + this.d + ", showSmallLayout=false)";
    }
}
