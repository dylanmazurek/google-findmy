package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eah extends eaj {
    private final eal a;

    public eah(eal ealVar) {
        this.a = ealVar;
    }

    @Override // defpackage.eaj, defpackage.ean
    public final eal a() {
        return this.a;
    }

    @Override // defpackage.ean
    public final int b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ean) {
            ean eanVar = (ean) obj;
            if (eanVar.b() == 2 && this.a.equals(eanVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ConnectivityInfo{cellular=" + this.a.toString() + "}";
    }
}
