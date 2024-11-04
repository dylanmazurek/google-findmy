package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsw implements hoc {
    public final jer a;
    private final int b;

    public hsw() {
        throw null;
    }

    public static final hsv c() {
        hsv hsvVar = new hsv((byte[]) null);
        hsvVar.a = (byte) 1;
        hsvVar.c = jdl.a;
        hsvVar.b = 1;
        return hsvVar;
    }

    @Override // defpackage.hoc
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.hoc
    public final boolean b() {
        int i = this.b;
        if (i == 3 || i == 1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hsw)) {
            return false;
        }
        hsw hswVar = (hsw) obj;
        int i = this.b;
        int i2 = hswVar.b;
        if (i != 0) {
            if (i == i2 && this.a.equals(hswVar.a)) {
                return true;
            }
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.b;
        a.N(i);
        return ((((i ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "StorageConfigurations{enablement=" + hod.a(this.b) + ", manualCapture=false, dirStatsConfigurations=" + String.valueOf(this.a) + "}";
    }

    public hsw(int i, jer jerVar) {
        this.b = i;
        this.a = jerVar;
    }
}
