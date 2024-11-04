package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzu {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final jis d;
    public final jis e;
    public final jis f;
    public final jis g;
    public final jer h;

    public dzu() {
        throw null;
    }

    public static dzr a() {
        dzr dzrVar = new dzr((byte[]) null);
        dzrVar.d(false);
        dzrVar.e(false);
        dzrVar.c(false);
        int i = jis.d;
        dzrVar.b(jmi.a);
        dzrVar.g(jmi.a);
        jis jisVar = jmi.a;
        if (jisVar != null) {
            dzrVar.a = jisVar;
            dzrVar.b = jisVar;
            return dzrVar;
        }
        throw new NullPointerException("Null supervisedAccountNames");
    }

    public final dzu b() {
        hwx.U(!this.a);
        dzr dzrVar = new dzr(this);
        dzrVar.e(true);
        return dzrVar.a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzu) {
            dzu dzuVar = (dzu) obj;
            if (this.a == dzuVar.a && this.b == dzuVar.b && this.c == dzuVar.c && hzc.L(this.d, dzuVar.d) && hzc.L(this.e, dzuVar.e) && hzc.L(this.f, dzuVar.f) && hzc.L(this.g, dzuVar.g) && this.h.equals(dzuVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 1237;
        if (true != this.a) {
            i = 1237;
        } else {
            i = 1231;
        }
        if (true != this.b) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int i4 = i ^ 1000003;
        if (true == this.c) {
            i3 = 1231;
        }
        return (((((((((((((i4 * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        jer jerVar = this.h;
        jis jisVar = this.g;
        jis jisVar2 = this.f;
        jis jisVar3 = this.e;
        return "DevicePickerState{isInitialLoading=" + this.a + ", isRefreshing=" + this.b + ", isFailure=" + this.c + ", devices=" + String.valueOf(this.d) + ", supervisedAccountDevices=" + String.valueOf(jisVar3) + ", supervisedAccountNames=" + String.valueOf(jisVar2) + ", filteredDevices=" + String.valueOf(jisVar) + ", profileInformation=" + String.valueOf(jerVar) + "}";
    }

    public dzu(boolean z, boolean z2, boolean z3, jis jisVar, jis jisVar2, jis jisVar3, jis jisVar4, jer jerVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = jisVar;
        this.e = jisVar2;
        this.f = jisVar3;
        this.g = jisVar4;
        this.h = jerVar;
    }
}
