package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dya {
    public final dxy a;
    public final lps b;
    public final boolean c;
    public final dxz d;
    private final jer e;

    public dya() {
        throw null;
    }

    public static dxw a() {
        dxw dxwVar = new dxw(null);
        dxwVar.a = new dxr(1);
        dxwVar.b(true);
        dxwVar.c = (byte) (dxwVar.c | 2);
        dxwVar.d(dxz.CENTER);
        return dxwVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dya) {
            dya dyaVar = (dya) obj;
            if (this.a.equals(dyaVar.a) && this.b.equals(dyaVar.b) && this.e.equals(dyaVar.e) && this.c == dyaVar.c && this.d.equals(dyaVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = this.a.hashCode() ^ 1000003;
        lps lpsVar = this.b;
        if (lpsVar.y()) {
            i = lpsVar.i();
        } else {
            int i3 = lpsVar.y;
            if (i3 == 0) {
                i3 = lpsVar.i();
                lpsVar.y = i3;
            }
            i = i3;
        }
        int hashCode2 = ((((hashCode * 1000003) ^ i) * 1000003) ^ this.e.hashCode()) * 1000003;
        if (true != this.c) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        return ((((hashCode2 ^ i2) * 1000003) ^ 1237) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        dxz dxzVar = this.d;
        jer jerVar = this.e;
        lps lpsVar = this.b;
        return "DeviceLocation{devicePinSource=" + String.valueOf(this.a) + ", locationWithAccuracy=" + String.valueOf(lpsVar) + ", locationTimestamp=" + String.valueOf(jerVar) + ", focusOnLocation=" + this.c + ", hidden=false, markerOrder=" + String.valueOf(dxzVar) + "}";
    }

    public dya(dxy dxyVar, lps lpsVar, jer jerVar, boolean z, dxz dxzVar) {
        this.a = dxyVar;
        this.b = lpsVar;
        this.e = jerVar;
        this.c = z;
        this.d = dxzVar;
    }
}
