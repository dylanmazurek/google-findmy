package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dxr extends dxt {
    private final int a;

    public dxr(int i) {
        this.a = i;
    }

    @Override // defpackage.dxy
    public final dxx a() {
        return dxx.DEVICE_CLASS;
    }

    @Override // defpackage.dxt, defpackage.dxy
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dxy) {
            dxy dxyVar = (dxy) obj;
            if (dxx.DEVICE_CLASS == dxyVar.a() && this.a == dxyVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        a.N(i);
        return i;
    }

    public final String toString() {
        String str;
        switch (this.a) {
            case 1:
                str = "NO_DEVICE";
                break;
            case 2:
                str = "PHONE";
                break;
            case 3:
                str = "GTV";
                break;
            case 4:
                str = "TABLET";
                break;
            case 5:
                str = "TABLET_LARGE";
                break;
            case 6:
                str = "ANDROID_TV";
                break;
            case 7:
                str = "WEAR";
                break;
            case 8:
                str = "ACCESSORY";
                break;
            default:
                str = "STYLUS";
                break;
        }
        return a.ag(str, "DevicePinSource{deviceClass=", "}");
    }
}
